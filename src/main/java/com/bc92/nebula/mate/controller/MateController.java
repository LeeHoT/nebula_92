package com.bc92.nebula.mate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by leehotin
 * Date: 2018/5/18  上午7:36
 * To change this template use File | Settings | FileTemplates
 */
@Controller
@RequestMapping("/nebula/92/")
public class MateController {

    /**
     * 手机号,地址,公司,公司地址,学校,学校地址,班级
     * @param model
     * @return
     */
    @RequestMapping("register")
    public String register(Model model){







        return "register";
    }

    /**
     * 用姓名和手机号登录
     * @param model
     * @return
     */
    @RequestMapping("login")
    public String loginPreview(Model model){


        //登陆成功进入首页
        return "login";
    }

    @RequestMapping("login/{name}")
    public String login(Model model){

        return "index";
    }
}
