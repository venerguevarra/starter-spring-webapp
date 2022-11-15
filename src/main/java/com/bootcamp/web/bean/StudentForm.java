package com.bootcamp.web.bean;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {
    @Size(min = 5, max = 30, message = "First name must be 5-30 characters")
    private String firstName;

    @Size(min = 5, max = 30, message = "Last name must be 5-30 characters")
    private String lastName;

    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @Min(value = 5, message = "Age should be greater than 5")
    @Max(value = 25, message = "Age should be less that 25")
    private Integer age;
    @Min(value = 1, message = "Grade level must be between 1-12")
    @Max(value = 12, message = "Grade level must be between 1-12")
    private Integer gradeLevel;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Past(message = "Invalid birth date")
    private Date birthDate;
}
