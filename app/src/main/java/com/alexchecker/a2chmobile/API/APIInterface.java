package com.alexchecker.a2chmobile.API;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIInterface {

    @GET("boards")
    Call<ArrayList<BoardsSchema>> getBoards();

    @GET("{board}/threads.json")
    Call<ThreadsList> getThreads(@Path("board") String boardID);

    @GET("after/{board}/{thread}/{thread}")
    Call<PostScheme> getPosts(@Path("board") String boardID, @Path("thread") int threadNum);
}
