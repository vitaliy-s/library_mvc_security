package ua.sosna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.sosna.dao.UserDAO;
import ua.sosna.model.User;

/**
 * Created by vitaliy on 12.05.16.
 */
@Controller
public class UserController {

    @Autowired
    UserDAO userDAO;

    @RequestMapping(value = "userRegister", method = RequestMethod.GET)
    public ModelAndView userRegister(ModelAndView modelAndView){
        User user = new User();
        modelAndView.addObject("newUser", user);
        modelAndView.setViewName("content/register");
        return modelAndView;
    }

    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute("newUser") User user){
        userDAO.saveUser(user);
        return new ModelAndView("redirect:/login");
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String adminUser(){
        return "content/admin";
    }
}
