package com.bc92.nebula.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: lihuiting
 * date: 2018/5/14
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("name", "Dear");
        return "index";
    }
}
