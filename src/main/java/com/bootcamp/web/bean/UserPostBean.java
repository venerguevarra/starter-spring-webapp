package com.bootcamp.web.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserPostBean implements Serializable {
    private static final long serialVersionUID = -7053658305583615432L;

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long postId;
    private String title;
    private Date postingDate;
}
