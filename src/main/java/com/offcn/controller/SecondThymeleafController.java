package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class SecondThymeleafController {


    @GetMapping("/second")
    public String indexPage(Model model){

        List<User> list = new ArrayList<>();
        User user1 = new User(1, "xiao", 11);
        User user2 = new User(2, "ere", 13);
        User user3 = new User(3, "drgddf", 33);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list",list);
        return "index2";
    }
}
