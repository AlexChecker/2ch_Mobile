
package com.alexchecker.a2chmobile.API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThreadsList {

    @SerializedName("board")
    @Expose
    private String board;
    @SerializedName("threads")
    @Expose
    private List<Thread> threads;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

}
