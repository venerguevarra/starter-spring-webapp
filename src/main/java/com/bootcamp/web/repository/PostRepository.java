package com.bootcamp.web.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.web.entity.Post;

public interface PostRepository extends JpaRepository<Post, UUID> {
}
