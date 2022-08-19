package com.PracticeSocialMedia.PracticeSocialMedia.controller;

import com.PracticeSocialMedia.PracticeSocialMedia.model.Post;
import com.PracticeSocialMedia.PracticeSocialMedia.model.User;
import com.PracticeSocialMedia.PracticeSocialMedia.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("post")
public class PostController {
    private final PostService postService;

    @PostMapping("save")
    public void savePost(@RequestBody Post post){
        postService.savePost(post);
    }

    @GetMapping("last-ten")
    public List<Post> getLastTenPosts(){
        return postService.getLastTenPosts();
    }

    @GetMapping("ten-reacts")
    public List<Post> getPostsWithMoreThan10Reacts(){
        return postService.getPostsWithMoreThanTenReacts();
    }

    @PostMapping("add-react/{postId}/{react}")
    public void addReactToPost(@PathVariable Integer postId, @PathVariable String react){
        postService.addReactionPost(postId, react);
    }

    @PostMapping("add-comment/{userId}/{postId}/{comment}")
    public void addCommentToPost(@PathVariable Integer userId, @PathVariable Integer postId, @PathVariable String comment){
        postService.addCommentToPost(userId, postId, comment);
    }

}
