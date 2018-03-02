package com.tongyuan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangcy on 2018/3/2
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "home";
    }
}
