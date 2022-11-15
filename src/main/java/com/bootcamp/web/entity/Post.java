package com.bootcamp.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "POSTS")
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Serializable {
    private static final long serialVersionUID = -7053658305583615432L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_post_sequence")
    @SequenceGenerator(sequenceName = "post_sequence", name = "custom_post_sequence", allocationSize = 1)
    private Long id;
    @Column(columnDefinition = "VARCHAR(150)", nullable = false)
    private String title;
    @Column(columnDefinition = "DATE", nullable = false)
    private Date postingDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
