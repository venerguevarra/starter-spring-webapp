package com.bootcamp.web.service;

import com.bootcamp.web.bean.UserPostListBean;

public interface UserPostService {
    UserPostListBean getAllPosts();

    void newPost(Long userId, String title);
}
