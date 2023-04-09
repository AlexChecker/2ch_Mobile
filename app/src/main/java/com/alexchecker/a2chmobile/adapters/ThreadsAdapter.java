package com.alexchecker.a2chmobile.adapters;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexchecker.a2chmobile.API.ThreadsList;
import com.alexchecker.a2chmobile.R;

public class ThreadsAdapter extends RecyclerView.Adapter<ThreadsAdapter.ViewHolder> {
    private ThreadsList threadsList;

    public ThreadsAdapter(ThreadsList threads)
    {
        threadsList = threads;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private final TextView threadSubject;
        private final TextView threadComment;

        public ViewHolder(View view)
        {
            super(view);

            threadSubject = view.findViewById(R.id.thread_subject);
            threadComment = view.findViewById(R.id.thread_comment);
            threadComment.setMovementMethod(LinkMovementMethod.getInstance());

        }


        @Override
        public void onClick(View v) {

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
    }

    @Override
    public int getItemCount() {
        return threadsList.getThreads().size();
    }
}
