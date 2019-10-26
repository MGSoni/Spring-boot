package com.example.springbootvalidation.model;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class User {

    @NotBlank(message="Username cannot be empty")
    private String name;
    @NotBlank(message="Password cannot be empty")
    @Length(min=6, max= 10, message="Length of the password should be between 6 to 10")
    private String password;
    @Min(value = 0)
    @Max(value = 100)
    private Double grade; // used double here which was a primitive tyoe. We have to use object instead.
    @Email
    private String email;

    public User(@NotBlank(message = "Username cannot be empty") String name, @NotBlank(message = "Password cannot be empty") @Length(min = 6, max = 10, message = "Length of the password should be between 6 to 10") String password, @Min(value = 0) @Max(value = 100) Double grade, @Email String email) {

        this.name = name;
        this.password = password;
        this.grade = grade;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
