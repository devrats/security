/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/27/2021
 *   Time: 1:12 PM
 *   File: HomeController.java
 */

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute("name","User");
        return "success";
    }

    @RequestMapping("/admin")
    public String admin(Model model){
        model.addAttribute("name","admin");
        return "success";
    }

    @RequestMapping("/userLogin")
    public String login(){
        return "userlogin";
    }

    @RequestMapping("/adminLogin")
    public String login1(){
        return "adminlogin";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "/logout";
    }
}