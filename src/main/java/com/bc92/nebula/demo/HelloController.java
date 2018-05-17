package com.bc92.nebula.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: lihuiting
 * date: 2018/5/14
 */
@Controller
@RequestMapping("92")
public class HelloController {


    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name", "Dear");
        return "index";
    }

    @RequestMapping("top/index")
    public String detail(Model model){
        return "top/detail";
    }

    @RequestMapping("address/index")
    public String address(Model model){

        return "address/index";
    }

    @RequestMapping("photos/index")
    public String photos(Model model){
        return "photos/index";
    }



}
