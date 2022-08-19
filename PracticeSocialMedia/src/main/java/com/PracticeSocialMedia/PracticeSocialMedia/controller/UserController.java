package com.PracticeSocialMedia.PracticeSocialMedia.controller;

import com.PracticeSocialMedia.PracticeSocialMedia.model.User;
import com.PracticeSocialMedia.PracticeSocialMedia.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @GetMapping("get/{name}")
    public List<User> getuserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping("save")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
