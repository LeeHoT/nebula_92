package com.bc92.nebula.demo;

import com.bc92.nebula.mate.dao.MateMapper;
import com.bc92.nebula.mate.entity.MatePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: lihuiting
 * date: 2018/5/14
 */
@Controller
public class HelloController {
    @Autowired
    private MateMapper mateMapper;

    @RequestMapping("index")
    public String index(Model model){
        MatePo matePo = new MatePo();
        matePo.setName("lihuiting");
        matePo.setPhone("13552154299");
        mateMapper.insert(matePo);
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
