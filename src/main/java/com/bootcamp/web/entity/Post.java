package com.bootcamp.web.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = Post.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post extends AbstractEntity {
    private static final long serialVersionUID = -2044753332567236782L;

    protected final static String TABLE_NAME = "POSTS";

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
