package com.zhangtiantong.redis.entity;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * Created by ZHANGTIANTONG on 2018/2/12/012.
 */
public class User implements Serializable {

    public static final long serialVersionUID = 491958049962316239L;

    private String id;
    private String name;
    private int age;

    private HttpServletRequest request;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        if (getId() != null ? !getId().equals(user.getId()) : user.getId() != null) return false;
        return !(getName() != null ? !getName().equals(user.getName()) : user.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }
}