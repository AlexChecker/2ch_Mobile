package com.alexchecker.a2chmobile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.alexchecker.a2chmobile.API.APIInterface;
import com.alexchecker.a2chmobile.API.RequestBuilder;
import com.alexchecker.a2chmobile.API.ThreadsList;
import com.alexchecker.a2chmobile.adapters.ThreadsAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ThreadReader extends Fragment {

    public String boardID = "b";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thread_reader, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView rec = view.findViewById(R.id.threads_list);

        APIInterface apiInterface = RequestBuilder.buildRequest2().create(APIInterface.class);

        Call<ThreadsList> threadsListCall = apiInterface.getThreads(boardID);

        threadsListCall.enqueue(new Callback<ThreadsList>() {
            @Override
            public void onResponse(Call<ThreadsList> call, Response<ThreadsList> response) {
                if(response.isSuccessful())
                {
                    rec.setLayoutManager(new LinearLayoutManager(getContext()));
                    rec.setHasFixedSize(true);
                    ThreadsAdapter adapter = new ThreadsAdapter(response.body());
                    rec.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ThreadsList> call, Throwable t) {

            }
        });


    }
}