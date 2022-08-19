package com.PracticeSocialMedia.PracticeSocialMedia.model;

import com.PracticeSocialMedia.PracticeSocialMedia.observer.PostObserver;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Comment> commentList;
    private String content;
    private List<React> reactList;

    @Transient
    PostObserver postObserver;

    public void addObserver(){
        postObserver = new PostObserver(this);
    }

    public void addComment(Comment comment){
        commentList.add(comment);
        postObserver.notify(comment);
    }

    public void addReact(React react){
        reactList.add(react);
    }
}
