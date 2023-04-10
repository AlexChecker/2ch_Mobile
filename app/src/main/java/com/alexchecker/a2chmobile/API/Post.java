
package com.alexchecker.a2chmobile.API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Post {

    @SerializedName("banned")
    @Expose
    private Integer banned;
    @SerializedName("board")
    @Expose
    private String board;
    @SerializedName("closed")
    @Expose
    private Integer closed;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("endless")
    @Expose
    private Integer endless;
    @SerializedName("files")
    @Expose
    private List<File> files;
    @SerializedName("lasthit")
    @Expose
    private Integer lasthit;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("num")
    @Expose
    private Integer num;
    @SerializedName("op")
    @Expose
    private Integer op;
    @SerializedName("parent")
    @Expose
    private Integer parent;
    @SerializedName("sticky")
    @Expose
    private Integer sticky;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("trip")
    @Expose
    private String trip;
    @SerializedName("views")
    @Expose
    private Integer views;

    public Integer getBanned() {
        return banned;
    }

    public void setBanned(Integer banned) {
        this.banned = banned;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public Integer getClosed() {
        return closed;
    }

    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEndless() {
        return endless;
    }

    public void setEndless(Integer endless) {
        this.endless = endless;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Integer getLasthit() {
        return lasthit;
    }

    public void setLasthit(Integer lasthit) {
        this.lasthit = lasthit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOp() {
        return op;
    }

    public void setOp(Integer op) {
        this.op = op;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

}
