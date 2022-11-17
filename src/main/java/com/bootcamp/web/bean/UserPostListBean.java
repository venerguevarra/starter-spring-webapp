package com.bootcamp.web.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class UserPostListBean {
    private List<UserPostBean> posts;

    public UserPostListBean() {
        posts = new ArrayList<>();
    }

    public void addPostBean(UserPostBean userPostBean) {
        posts.add(userPostBean);
    }
}
