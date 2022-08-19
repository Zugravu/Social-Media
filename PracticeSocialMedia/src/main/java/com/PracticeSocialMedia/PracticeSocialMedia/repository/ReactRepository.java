package com.PracticeSocialMedia.PracticeSocialMedia.repository;

import com.PracticeSocialMedia.PracticeSocialMedia.model.React;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactRepository extends JpaRepository<React, Integer> {
}
