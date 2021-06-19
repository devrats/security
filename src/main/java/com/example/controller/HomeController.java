/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/27/2021
 *   Time: 1:12 PM
 *   File: HomeController.java
 */

package com.example.controller;

import com.example.entity.Customer;
import com.example.entity.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/")
    public String h(){
        return "home";
    }
    @RequestMapping("/success")
    public String home(@RequestParam("userName") String userName, @RequestParam("password") String password){
        Customer customer = new Customer();
        customer.setUserName(userName);
        customer.setPassword(bCryptPasswordEncoder.encode(password));
        customer.setRole("ROLE_ADMIN");
        customerRepository.save(customer);
        return "success";
    }

    @RequestMapping("/user")
    public String user(Model model, Principal principal){
        System.out.println(principal);
        model.addAttribute("name",principal.getName());
        return "success";
    }

    @RequestMapping("/admin")
    public String admin(Model model, Principal principal){
        model.addAttribute("name",principal.getName());
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