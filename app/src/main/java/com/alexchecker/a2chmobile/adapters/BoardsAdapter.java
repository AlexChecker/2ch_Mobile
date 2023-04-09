package com.alexchecker.a2chmobile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alexchecker.a2chmobile.API.BoardsSchema;
import com.alexchecker.a2chmobile.MainActivity;
import com.alexchecker.a2chmobile.R;
import com.alexchecker.a2chmobile.ThreadReader;

import java.util.ArrayList;

/**
 * Да блять, я перепутал доски с тредами, мне похуй. Главное не забыть что куда пихать потом
 */
public class BoardsAdapter extends RecyclerView.Adapter<BoardsAdapter.ViewHolder> {

    private ArrayList<BoardsSchema> threadsList;
    private FragmentManager fragmentManager;

    public BoardsAdapter(ArrayList<BoardsSchema> list, FragmentManager frag)

    {
        threadsList = list;
        fragmentManager = frag;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private final TextView threadName;
        private final TextView threadID;
        public String ID;

        public FragmentManager frag;

        public ViewHolder(View view)
        {
            super(view);
            threadName = view.findViewById(R.id.thread_name);
            threadID = view.findViewById(R.id.thread_id);
            view.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            ThreadReader thr = new ThreadReader();
            thr.boardID = ID;
            MainActivity.threadView = thr;
            MainActivity.bottomNav.setSelectedItemId(R.id.PostList);
            frag.beginTransaction().replace(R.id.fragmentViewer,thr,null).commit();
        }

        public TextView getThreadName() {
            return threadName;
        }

        public TextView getThreadID() {
            return threadID;
        }
    }

    @NonNull
    @Override
    public BoardsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.board_item,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull BoardsAdapter.ViewHolder holder, int position) {
        holder.getThreadName().setText(threadsList.get(position).getName());
        holder.getThreadID().setText("/"+threadsList.get(position).getId()+"/");
        holder.ID = threadsList.get(position).getId();
        holder.frag = fragmentManager;
    }

    @Override
    public int getItemCount() {
        return threadsList.size();
    }


}
