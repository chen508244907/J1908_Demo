package com.test.j1908.service.impl;

import com.test.j1908.bean.User;
import com.test.j1908.mapper.UserMapper;
import com.test.j1908.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll ();
    }

    @Override
    public Boolean insertUser(User user) {
        int insert = userMapper.insert ( user );
        if(insert>0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteById(int id) {
        int delete = userMapper.deleteByPrimaryKey ( id );
        if(delete>0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateById(User user) {
        int update = userMapper.updateByPrimaryKey ( user );
        if(update>0){
            return true;
        }
        return false;
    }
}
