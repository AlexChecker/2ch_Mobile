package com.alexchecker.a2chmobile.adapters;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alexchecker.a2chmobile.API.ThreadsList;
import com.alexchecker.a2chmobile.MainActivity;
import com.alexchecker.a2chmobile.PostReader;
import com.alexchecker.a2chmobile.R;

public class ThreadsAdapter extends RecyclerView.Adapter<ThreadsAdapter.ViewHolder> {
    private ThreadsList threadsList;
    private FragmentManager fragmentManager;

    public ThreadsAdapter(ThreadsList threads, FragmentManager frag)
    {
        threadsList = threads; fragmentManager=frag;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private final TextView threadSubject;
        private final TextView threadComment;
        public int threadID;

        public String boardID;
        public FragmentManager frag;

        public ViewHolder(View view)
        {
            super(view);

            threadSubject = view.findViewById(R.id.thread_subject);
            threadComment = view.findViewById(R.id.thread_comment);
            threadComment.setMovementMethod(LinkMovementMethod.getInstance());
            view.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            PostReader post = new PostReader();
            post.boardID = boardID;
            post.threadNumber=threadID;
            MainActivity.postView= post;
            MainActivity.bottomNav.setSelectedItemId(R.id.PostContent);
            frag.beginTransaction().replace(R.id.fragmentViewer,post,null).commit();
        }

        public TextView getThreadSubject() {
            return threadSubject;
        }

        public TextView getThreadComment() {
            return threadComment;
        }
    }

    @NonNull
    @Override
    public ThreadsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.thread_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThreadsAdapter.ViewHolder holder, int position) {
        holder.getThreadSubject().setText(threadsList.getThreads().get(position).getSubject());
        holder.getThreadComment().setText(Html.fromHtml( threadsList.getThreads().get(position).getComment(),0));
        holder.threadID = threadsList.getThreads().get(position).getNum();
        holder.boardID = threadsList.getBoard();
        holder.frag = fragmentManager;
    }

    @Override
    public int getItemCount() {
        return threadsList.getThreads().size();
    }
}
