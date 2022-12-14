package com.PracticeSocialMedia.PracticeSocialMedia.repository;

import com.PracticeSocialMedia.PracticeSocialMedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findAllByName(String name);
}
