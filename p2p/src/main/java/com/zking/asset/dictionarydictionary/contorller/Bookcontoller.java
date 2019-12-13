package com.zking.asset.dictionarydictionary.contorller;

import com.zking.asset.dictionarydictionary.model.Dict;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
@RequestMapping("/Books")
public class Bookcontoller {
//    @RequestMapping("/addbook")
////    public String addbook(HttpServletRequest request, HttpServletResponse response
////    ,Dict dict ,@RequestParam("sex") String sex){
////        System.out.println(request);
////        System.out.println(response);
////        System.out.println(dict);
////        System.out.println(sex);
////        ModelAndView mv=new ModelAndView();
////        mv.setViewName("Book/Bookadd");//跳转页面
////        mv.addObject("book",dict);//传入参数
////        return mv;
////        return "Book/Bookadd";
////
////    }
    @RequestMapping("/Dictadd")
    public String addDict(){
    log.info("新增");
        return "Book/Bookadd";
    }

    @RequestMapping("/booklist")
    public String bookList(){
        log.info("书本列表");
        return "Book/booklist";
    }

    @RequestMapping("/bookUpload")
    public String bookUpload(Model model){
        log.info("书本列表");
        return "Book/bookUpload";
    }


}
