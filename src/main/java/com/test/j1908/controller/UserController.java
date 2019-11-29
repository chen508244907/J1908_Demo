package com.test.j1908.controller;

import com.test.j1908.bean.User;
import com.test.j1908.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    public static final Logger logger= LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> users = userService.findAll ();
        logger.info (users);
        return users;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String insertUser(@RequestBody User user){
        logger.info (user);
        Boolean insertUser = userService.insertUser (user);
        if(insertUser){
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "/deleteById/{uid}",method = RequestMethod.POST)
    public String deleteById(@PathVariable("uid") int id){
        logger.info (id);
        Boolean deleteUser = userService.deleteById ( id );
        if(deleteUser){
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String updateUser(@RequestBody User user){
        Boolean updateUser = userService.updateById ( user );
        if(updateUser){
            return "success";
        }
        return "fail";
    }
}
