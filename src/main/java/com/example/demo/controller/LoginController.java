package com.example.demo.controller;


import com.example.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * 职员操作相关
 */
@RestController
public class LoginController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/login",method = POST)
    public String login(String name, String pwd) {
        int Count = staffService.SelectForLogin(name, pwd);
//        System.out.println(Count);
        if (Count == 1) {
            return "success";
        }
//        System.out.println("out");
        return "error";
    }

}
