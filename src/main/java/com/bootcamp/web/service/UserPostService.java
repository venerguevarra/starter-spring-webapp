package com.bootcamp.web.service;

import java.util.List;

import com.bootcamp.web.entity.Post;

public interface UserPostService {
    List<Post> getAllPosts();

    void newPost(Long userId, String title);
}
