package com.alexchecker.a2chmobile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexchecker.a2chmobile.API.APIInterface;
import com.alexchecker.a2chmobile.API.PostScheme;
import com.alexchecker.a2chmobile.API.RequestBuilder;
import com.alexchecker.a2chmobile.API.ThreadsList;
import com.alexchecker.a2chmobile.adapters.PostsAdapter;
import com.alexchecker.a2chmobile.adapters.ThreadsAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PostReader extends Fragment {

    public String boardID;
    public int threadNumber;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_reader, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);

        RecyclerView rec = view.findViewById(R.id.posts_recycler);

        APIInterface apiInterface = RequestBuilder.buildRequest().create(APIInterface.class);

        Call<PostScheme> postsCall = apiInterface.getPosts(boardID,threadNumber);

        postsCall.enqueue(new Callback<PostScheme>() {
        @Override
        public void onResponse(Call<PostScheme> call, Response<PostScheme> response) {
            if(response.isSuccessful())
            {
                rec.setLayoutManager(new LinearLayoutManager(getContext()));
                rec.setHasFixedSize(true);
                PostsAdapter adapter = new PostsAdapter(response.body());
                rec.setAdapter(adapter);
            }
        }

        @Override
        public void onFailure(Call<PostScheme> call, Throwable t) {

        }
    });

    }
}