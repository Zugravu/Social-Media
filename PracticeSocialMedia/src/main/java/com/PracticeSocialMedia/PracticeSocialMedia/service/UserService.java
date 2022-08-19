package com.PracticeSocialMedia.PracticeSocialMedia.service;

import com.PracticeSocialMedia.PracticeSocialMedia.model.User;
import com.PracticeSocialMedia.PracticeSocialMedia.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUserByName(String name){
        return userRepository.findAllByName(name);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}
