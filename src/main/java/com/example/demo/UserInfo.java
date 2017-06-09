package com.example.demo;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by PengXiaoJie on 2017/6/8.
 */

@Entity
@Table(name = "UserInfo")
public class UserInfo {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "userName")
    private String userName;

    @NotNull
    @Column(name = "sex")
    private String sex;

    public UserInfo(String userName, String sex) {
        this.userName = userName;
        this.sex = sex;
    }
    public UserInfo(int id,String userName, String sex) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
    }

    public UserInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
