package com.lzt.springcloud.microservice.dao;

import java.util.List;

import com.lzt.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public boolean addUser(User user);

    public User getUser(int id);

    public List<User> getUsers();
}
