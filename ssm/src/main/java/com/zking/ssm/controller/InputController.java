package com.zking.ssm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class InputController {

    @RequestMapping("/input/{dir}/{path}")
    public String input(@PathVariable("dir") String dir,
                        @PathVariable("path")  String  path ){
        return dir+"/"+path;
    }
   @RequestMapping("/input/{path}")
    public String file(  @PathVariable("path")  String  path){
   return path;
   }



}
