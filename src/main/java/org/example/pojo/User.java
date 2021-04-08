package org.example.pojo;

/**
 * @Description
 * @ClassName User
 * @Author wny
 * @Date 2021/4/8 21:32
 * @Version 1.0
 */

public class User {
    private String userName;
    private Integer age;

    public User() {
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
