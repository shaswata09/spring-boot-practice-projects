package com.leonardo.example.restfulwebservices.user;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User {
    private Integer id;
    private String name;
    private Date date;

    public User(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
