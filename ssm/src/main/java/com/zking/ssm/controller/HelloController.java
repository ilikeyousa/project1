package com.zking.ssm.controller;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/index")
public class HelloController {
@RequestMapping("")
    public String toHello(){
        log.info("hello");
        return  "index";
    }

    @RequestMapping(value ="/toHome")
    public String toHome(){
        log.info("home");
        return  "home";
    }

}
