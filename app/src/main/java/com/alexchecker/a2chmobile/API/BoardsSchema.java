
package com.alexchecker.a2chmobile.API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoardsSchema {

    @SerializedName("bump_limit")
    @Expose
    private Integer bumpLimit;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("default_name")
    @Expose
    private String defaultName;
    @SerializedName("enable_dices")
    @Expose
    private Boolean enableDices;
    @SerializedName("enable_flags")
    @Expose
    private Boolean enableFlags;
    @SerializedName("enable_icons")
    @Expose
    private Boolean enableIcons;
    @SerializedName("enable_likes")
    @Expose
    private Boolean enableLikes;
    @SerializedName("enable_names")
    @Expose
    private Boolean enableNames;
    @SerializedName("enable_oekaki")
    @Expose
    private Boolean enableOekaki;
    @SerializedName("enable_posting")
    @Expose
    private Boolean enablePosting;
    @SerializedName("enable_sage")
    @Expose
    private Boolean enableSage;
    @SerializedName("enable_shield")
    @Expose
    private Boolean enableShield;
    @SerializedName("enable_subject")
    @Expose
    private Boolean enableSubject;
    @SerializedName("enable_thread_tags")
    @Expose
    private Boolean enableThreadTags;
    @SerializedName("enable_trips")
    @Expose
    private Boolean enableTrips;
    @SerializedName("file_types")
    @Expose
    private List<String> fileTypes;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("info_outer")
    @Expose
    private String infoOuter;
    @SerializedName("max_comment")
    @Expose
    private Integer maxComment;
    @SerializedName("max_files_size")
    @Expose
    private Integer maxFilesSize;
    @SerializedName("max_pages")
    @Expose
    private Integer maxPages;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("threads_per_page")
    @Expose
    private Integer threadsPerPage;

    public Integer getBumpLimit() {
        return bumpLimit;
    }

    public void setBumpLimit(Integer bumpLimit) {
        this.bumpLimit = bumpLimit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public Boolean getEnableDices() {
        return enableDices;
    }

    public void setEnableDices(Boolean enableDices) {
        this.enableDices = enableDices;
    }

    public Boolean getEnableFlags() {
        return enableFlags;
    }

    public void setEnableFlags(Boolean enableFlags) {
        this.enableFlags = enableFlags;
    }

    public Boolean getEnableIcons() {
        return enableIcons;
    }

    public void setEnableIcons(Boolean enableIcons) {
        this.enableIcons = enableIcons;
    }

    public Boolean getEnableLikes() {
        return enableLikes;
    }

    public void setEnableLikes(Boolean enableLikes) {
        this.enableLikes = enableLikes;
    }

    public Boolean getEnableNames() {
        return enableNames;
    }

    public void setEnableNames(Boolean enableNames) {
        this.enableNames = enableNames;
    }

    public Boolean getEnableOekaki() {
        return enableOekaki;
    }

    public void setEnableOekaki(Boolean enableOekaki) {
        this.enableOekaki = enableOekaki;
    }

    public Boolean getEnablePosting() {
        return enablePosting;
    }

    public void setEnablePosting(Boolean enablePosting) {
        this.enablePosting = enablePosting;
    }

    public Boolean getEnableSage() {
        return enableSage;
    }

    public void setEnableSage(Boolean enableSage) {
        this.enableSage = enableSage;
    }

    public Boolean getEnableShield() {
        return enableShield;
    }

    public void setEnableShield(Boolean enableShield) {
        this.enableShield = enableShield;
    }

    public Boolean getEnableSubject() {
        return enableSubject;
    }

    public void setEnableSubject(Boolean enableSubject) {
        this.enableSubject = enableSubject;
    }

    public Boolean getEnableThreadTags() {
        return enableThreadTags;
    }

    public void setEnableThreadTags(Boolean enableThreadTags) {
        this.enableThreadTags = enableThreadTags;
    }

    public Boolean getEnableTrips() {
        return enableTrips;
    }

    public void setEnableTrips(Boolean enableTrips) {
        this.enableTrips = enableTrips;
    }

    public List<String> getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(List<String> fileTypes) {
        this.fileTypes = fileTypes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoOuter() {
        return infoOuter;
    }

    public void setInfoOuter(String infoOuter) {
        this.infoOuter = infoOuter;
    }

    public Integer getMaxComment() {
        return maxComment;
    }

    public void setMaxComment(Integer maxComment) {
        this.maxComment = maxComment;
    }

    public Integer getMaxFilesSize() {
        return maxFilesSize;
    }

    public void setMaxFilesSize(Integer maxFilesSize) {
        this.maxFilesSize = maxFilesSize;
    }

    public Integer getMaxPages() {
        return maxPages;
    }

    public void setMaxPages(Integer maxPages) {
        this.maxPages = maxPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getThreadsPerPage() {
        return threadsPerPage;
    }

    public void setThreadsPerPage(Integer threadsPerPage) {
        this.threadsPerPage = threadsPerPage;
    }

}
