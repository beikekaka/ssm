package com.beikekaka.controller;

import com.beikekaka.model.User;
import com.beikekaka.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Issac on 2018/5/28.
 */
@Controller
public class TestController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showTest")
    public ModelAndView showUser(){
        ModelAndView mav = new ModelAndView("index");
        User user = this.userService.selectUser(2);
        mav.addObject("user",user);
        return mav;
    }
}
