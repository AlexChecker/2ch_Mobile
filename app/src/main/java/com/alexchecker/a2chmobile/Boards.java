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
import com.alexchecker.a2chmobile.API.RequestBuilder;
import com.alexchecker.a2chmobile.API.BoardsSchema;
import com.alexchecker.a2chmobile.adapters.BoardsAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Boards extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_boards, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);
        RecyclerView threadsRecycler = view.findViewById(R.id.thread_list_fragment);

        APIInterface apiInterface = RequestBuilder.buildRequest().create(APIInterface.class);

        Call<ArrayList<BoardsSchema>> threads = apiInterface.getBoards();

        threads.enqueue(new Callback<ArrayList<BoardsSchema>>() {
            @Override
            public void onResponse(Call<ArrayList<BoardsSchema>> call, Response<ArrayList<BoardsSchema>> response) {
                if (response.isSuccessful())
                {
                    threadsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
                    threadsRecycler.setHasFixedSize(true);
                    BoardsAdapter adapter = new BoardsAdapter(response.body(), getParentFragmentManager());
                    threadsRecycler.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<BoardsSchema>> call, Throwable t) {

            }
        });
    }
}