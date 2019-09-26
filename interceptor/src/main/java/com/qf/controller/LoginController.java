package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(String username, String password, HttpServletRequest request){
        if("admin".equals(username)&&"admin".equals(password)){
            request.getSession().setAttribute("user","admin");
            return "userList";
        }else {
            request.setAttribute("msg","用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("/addUser")
    public String addUser(){
        System.out.println("添加用户");
        return "userList";
    }
}
