package com.leo.springboot2book.controller;

import com.leo.springboot2book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeetlController {


    @Autowired
    UserService userService;

    @RequestMapping("/index.html")
    @ResponseBody
    public String index() {
        return "Hello";
    }
   /* public ModelAndView say(Model model) {
        User user = userService.getUserById(1);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(user);
        modelAndView.setViewName( "/index.btl");
        return modelAndView;
    }*/



}