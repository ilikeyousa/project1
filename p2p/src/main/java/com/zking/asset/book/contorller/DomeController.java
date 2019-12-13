package com.zking.asset.book.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DomeController {

    @RequestMapping("/toBookAdd")
    public  String toBookAdd(){
        return "/Book/Bookadd";
    }
}
