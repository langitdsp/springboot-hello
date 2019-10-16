package com.asterx.medirecords.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;

    private String name;

    public User(){

    }

    public User(String name){
        this.name = name;
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
}
