package com.PracticeSocialMedia.PracticeSocialMedia.repository;

import com.PracticeSocialMedia.PracticeSocialMedia.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
