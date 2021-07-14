package com.datacanvas.superion.controller;

import com.datacanvas.superion.entity.User;
import com.datacanvas.superion.mapper.LoginMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Login {

    @Resource
    LoginMapper loginMapper;

    @RequestMapping("/haha")
    public User haha(){

        User allUser = loginMapper.getAllUser();

        return allUser;
    }

}
