package com.asterx.medirecords.rest;

import com.asterx.medirecords.model.User;
import com.asterx.medirecords.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/find/{name}")
    public String findByLastName(@PathVariable("name") String name){
        User user = repository.findByName(name);
        return user.getName();
    }
}
