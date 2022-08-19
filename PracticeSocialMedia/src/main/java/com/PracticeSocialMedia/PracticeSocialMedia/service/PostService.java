package com.PracticeSocialMedia.PracticeSocialMedia.service;

import com.PracticeSocialMedia.PracticeSocialMedia.factory.ReactFactory;
import com.PracticeSocialMedia.PracticeSocialMedia.model.Comment;
import com.PracticeSocialMedia.PracticeSocialMedia.model.Post;
import com.PracticeSocialMedia.PracticeSocialMedia.model.React;
import com.PracticeSocialMedia.PracticeSocialMedia.model.User;
import com.PracticeSocialMedia.PracticeSocialMedia.repository.PostRepository;
import com.PracticeSocialMedia.PracticeSocialMedia.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public void savePost(Post post){
        postRepository.save(post);
    }

    public List<Post> getLastTenPosts(){
        // return postRepository.getTop10Posts();
        return postRepository.findAll().stream()
                .skip(postRepository.count() -10)
                .collect(Collectors.toList());
    }

    public List<Post> getPostsWithMoreThanTenReacts(){
        return postRepository.findAll().stream()
                .filter(x -> x.getReactList().size() >= 10)
                .collect(Collectors.toList());
    }

    public void addReactionPost(Integer postId, String reaction){
        Post post = postRepository.findById(postId).get();
        post.addReact(ReactFactory.createReact(reaction));
        postRepository.save(post);
    }

    public void addCommentToPost(Integer userId, Integer postId, String comment){
        Date currentDate = Date.valueOf(String.valueOf(LocalDateTime.now()));
        Comment myComment =  new Comment(
                null,
                currentDate,
                userRepository.findById(userId).get(),
                comment
        );
        Post post = postRepository.findById(postId).get();
        post.addComment(myComment);
        postRepository.save(post);
    }
}






