package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Text {

    @RequestMapping("index")
    public String index(){
        return "/index.jsp";
    }
}
