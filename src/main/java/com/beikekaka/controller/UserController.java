package com.beikekaka.controller;

import com.beikekaka.model.User;
import com.beikekaka.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public ModelAndView showUser(){
        ModelAndView mav = new ModelAndView("index");
        User user = this.userService.selectUser(1);
        mav.addObject("user",user);
        return mav;
    }
}
