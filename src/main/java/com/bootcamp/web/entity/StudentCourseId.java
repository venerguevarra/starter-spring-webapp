package com.bootcamp.web.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseId implements Serializable {
    private static final long serialVersionUID = 2360992123657946697L;

    @Column(name = "student_id")
    private UUID studentId;

    @Column(name = "course_id")
    private UUID courseId;

}
