package com.lzt.springcloud.microservice.service;

import com.lzt.springcloud.entity.User;

import java.util.List;
public interface UserService {

    public boolean addUser(User user);

    public User getUser(int id);

    public List<User> getUsers();
}

