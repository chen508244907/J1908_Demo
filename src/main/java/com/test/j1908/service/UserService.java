package com.test.j1908.service;

import com.test.j1908.bean.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public Boolean insertUser(User user);

    public Boolean deleteById(int id);

    public Boolean updateById(User user);
}
