
package com.alexchecker.a2chmobile.API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostScheme {

    @SerializedName("posts")
    @Expose
    private List<Post> posts;
    @SerializedName("result")
    @Expose
    private Integer result;
    @SerializedName("unique_posters")
    @Expose
    private Integer uniquePosters;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getUniquePosters() {
        return uniquePosters;
    }

    public void setUniquePosters(Integer uniquePosters) {
        this.uniquePosters = uniquePosters;
    }

}
