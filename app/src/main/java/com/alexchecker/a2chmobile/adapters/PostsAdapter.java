package com.alexchecker.a2chmobile.adapters;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexchecker.a2chmobile.API.NetworkImage;
import com.alexchecker.a2chmobile.API.PostScheme;
import com.alexchecker.a2chmobile.R;

import java.util.concurrent.ExecutionException;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    PostScheme scheme;

    public PostsAdapter(PostScheme scheme)
    {
        this.scheme = scheme;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView postSubject;
        private final TextView postComment;
        private final LinearLayout images;

        public Context context;


        public ViewHolder(View view)
        {
            super(view);

            postSubject = view.findViewById(R.id.post_subject);
            postComment = view.findViewById(R.id.post_comment);
            images = view.findViewById(R.id.post_images);

        }

        public TextView getPostSubject(){return postSubject;}
        public TextView getPostComment(){return postComment;}
        public LinearLayout getImages(){return images;}

    }

    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);
        ViewHolder v = new ViewHolder(view);
        v.context = parent.getContext();
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.ViewHolder holder, int position) {
        holder.getPostSubject().setText(scheme.getPosts().get(position).getSubject());
        holder.getPostComment().setText(Html.fromHtml( scheme.getPosts().get(position).getComment(),0));
        if (scheme.getPosts().get(position).getFiles()!=null)
        if(scheme.getPosts().get(position).getFiles().size()>0)
        {
            for(int i = 0;i<scheme.getPosts().get(position).getFiles().size();i++)
            {
                ImageView view = new ImageView(holder.context);
                NetworkImage img = new NetworkImage();
                img.execute("https://2ch.hk"+scheme.getPosts().get(position).getFiles().get(i).getPath());
                try
                {
                    view.setImageDrawable(img.get());
                    holder.getImages().addView(view);
                } catch (ExecutionException e) {
                    Log.e("NetworkImage",e.getMessage());
                } catch (InterruptedException e) {
                    Log.e("NetworkImage",e.getMessage());
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return scheme.getPosts().size();
    }
}
