package com.edu.demo1.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String nickname;

    private String emailAddr;

    private Integer state;

    private String password;

    private String role;

    private static final long serialVersionUID = 1L;

    public User(Integer id, String nickname, String emailAddr, Integer state, String password, String role) {
        this.id = id;
        this.nickname = nickname;
        this.emailAddr = emailAddr;
        this.state = state;
        this.password = password;
        this.role = role;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr == null ? null : emailAddr.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}