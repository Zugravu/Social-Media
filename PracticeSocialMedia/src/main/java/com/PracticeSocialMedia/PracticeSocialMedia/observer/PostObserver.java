package com.PracticeSocialMedia.PracticeSocialMedia.observer;

import com.PracticeSocialMedia.PracticeSocialMedia.model.Comment;
import com.PracticeSocialMedia.PracticeSocialMedia.model.Post;

import java.util.Observable;

public class PostObserver{
    private Post observedPost;

    public PostObserver(Post p){
        this.observedPost = p;
    }

    public void notify(Comment comment){
        System.out.println(observedPost.getUser().getName() + ": You have a new comment \n" + comment.getContent());
    }
}
