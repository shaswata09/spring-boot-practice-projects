package com.leonardo.example.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description = "User Model description")
public class User {
    private Integer id;

    @ApiModelProperty(notes = "Name sould be at least 2 chars")
    @NotNull(message = "Name should not be null")
    @Size(min=2, message = "Name should have at least 2 characters")
    private String name;

    @ApiModelProperty(notes = "DOB should be in past")
    @NotNull(message = "DOB should not be null")
    @Past(message = "DOB should be in past")
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