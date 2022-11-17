package com.bootcamp.web.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.web.bean.UserPostBean;
import com.bootcamp.web.bean.UserPostListBean;
import com.bootcamp.web.entity.Post;
import com.bootcamp.web.entity.User;
import com.bootcamp.web.repository.PostRepository;
import com.bootcamp.web.repository.UserRepository;

@Service
public class UserPostServiceImpl implements UserPostService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public UserPostListBean getAllPosts() {
        List<Post> posts = postRepository.findAll();
        UserPostListBean userPostListBean = new UserPostListBean();

        List<UserPostBean> userPosts = posts.stream()
                                            .map(p -> new UserPostBean(p.getUser().getId(),
                                                                       p.getUser().getFirstName(),
                                                                       p.getUser().getLastName(),
                                                                       p.getUser().getEmail(),
                                                                       p.getId(),
                                                                       p.getTitle(),
                                                                       p.getPostingDate()))
                                            .collect(Collectors.toList());
        userPostListBean.setPosts(userPosts);

        return userPostListBean;
    }

    @Override
    public void newPost(Long userId, String title) {
        final Optional<User> existingUser = userRepository.findById(userId);
        if (!existingUser.isPresent()) {
            throw new RuntimeException("User not found.");
        }
        Post post = new Post();
        post.setUser(existingUser.get());
        post.setTitle(title);
        post.setPostingDate(new Date());
        postRepository.save(post);
    }

}
