package com.example.simpleretrofitlist.Entities;

public class Post {

    //Private Attributes
    private int userId;
    private int postId; //código
    private String title;
    private String body;

    //Constructor

    public Post(int userId, int postId, String title, String body) {
        this.userId = userId;
        this.postId = postId;
        this.title = title;
        this.body = body;
    }

    //Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + postId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
