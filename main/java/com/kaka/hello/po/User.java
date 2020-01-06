package com.kaka.hello.po;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String username;
    private String address;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
        super();
    }

    public User(Integer id, String username, String address) {
        super();
        this.id = id;
        this.username = username;
        this.address = address;
    }
}
