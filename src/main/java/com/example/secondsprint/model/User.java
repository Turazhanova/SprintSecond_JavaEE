package com.example.secondsprint.model;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String email;
    private String password;
    private String fullName;

    public User() {
    }

    public User(Long id, String email, String password, String fullName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {
        return "Users [id=" + this.id + ", email=" + this.email + ", password=" + this.password + ", fullName=" + this.fullName + "]";
    }
}
