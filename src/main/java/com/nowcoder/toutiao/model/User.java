package com.nowcoder.toutiao.model;

/**
 * @program: toutiao
 * @description: User
 * @author: Cheng Qun
 * @create: 2019-02-25 16:19
 */
public class User {
    public String name;
    public User(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
