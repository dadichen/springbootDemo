package com.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_age")
    private String user_age;

    public Integer getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_age='" + user_age + '\'' +
                '}';
    }
}
