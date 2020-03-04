package com.example.demo.controller;

import com.example.demo.entity.TbUser;
import com.example.demo.mapper.TbStaffMapper;
import com.example.demo.mapper.TbUserMapper;
import com.example.demo.service.StaffService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * 职员操作相关
 */
@Controller
public class LoginController {

    private StaffService staffService;


    public String login(HttpServletRequest request, Model model) {
        String name = request.getParameter("");
        String pwd = request.getParameter("");
        if (staffService.SelectByStaffName(name)==0){
            return "success";
        }
        System.out.println(staffService.SelectByStaffName(name));
        return "";
    }
}
