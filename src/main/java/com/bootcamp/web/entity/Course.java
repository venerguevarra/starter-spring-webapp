package com.bootcamp.web.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = Course.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course extends AbstractEntity {
    private static final long serialVersionUID = -2044753332567236782L;

    protected final static String TABLE_NAME = "COURSES";

    private String name;
    private String description;

    @OneToMany(mappedBy = "course")
    private Set<StudentCourse> students = new HashSet<>();
}
