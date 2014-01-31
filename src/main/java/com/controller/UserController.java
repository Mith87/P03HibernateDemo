package com.controller;

import java.util.List;

import com.model.User;
import com.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/user/login")
    public ModelAndView userRegisterView() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value="/user/register", method=RequestMethod.POST)
    public ModelAndView userRegister(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView("register");
        userService.add(user);
        String message = "User "+user.getName()+" added";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value="/user/manager")
    public ModelAndView userManager() {
        ModelAndView modelAndView = new ModelAndView("manager");
        List<User> users = userService.getAll();
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @RequestMapping(value="/user/edit/{id}", method=RequestMethod.GET)
    public ModelAndView userGetById(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("profile");
        User user = userService.getById(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value="/user/edit/{id}", method=RequestMethod.POST)
    public ModelAndView userEdit(@ModelAttribute User user, @PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("manager");
        userService.update(user);
        String message = "User "+user.getName()+" modified";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value="/user/delete/{id}", method=RequestMethod.GET)
    public ModelAndView userDelete(@ModelAttribute User user, @PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("manager");
        userService.delete(id);
        String message = "User "+user.getName()+" deleted";
        modelAndView.addObject("message", message);
        return modelAndView;
    }
}
