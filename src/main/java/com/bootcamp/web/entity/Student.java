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
@Table(name = Student.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends AbstractEntity {
    private static final long serialVersionUID = -2044753332567236782L;

    protected final static String TABLE_NAME = "STUDENTS";

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "student")
    private Set<StudentCourse> courses = new HashSet<>();

}
