package com.Pojo;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/9.
 */
@Component
public class User {
    private int id;
    private String account;
    private String password;
    private int age;

    public User(int id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public User() {
        super();
        Random r = new Random();
        age=r.nextInt(100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	this.age = age;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
