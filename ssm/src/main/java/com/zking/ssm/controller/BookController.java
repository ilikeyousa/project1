package com.zking.ssm.controller;


import com.zking.ssm.model.Book;
import com.zking.ssm.model.BookType;
import com.zking.ssm.service.IBookSerivce;
import com.zking.ssm.util.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
@Slf4j
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookSerivce bookSerivce;
    @ModelAttribute
public void initData(Model model){
        log.info("非请求处理参数");
        List<BookType>  lst=new ArrayList<BookType>();
    lst.add(new BookType("asda1a","a6sda"));
        lst.add(new BookType("asd2aa","as5da"));
        lst.add(new BookType("asd3aa","as4da"));
        model.addAttribute("btyte",lst);
        model.addAttribute("book",new Book());
    }
@RequestMapping("/addBook")
    public String addBook(@Validated Book book, BindingResult bindingResult){
log.info("book={}",book);
if (bindingResult.hasErrors()){
   return  "book/book";
}else {
    bookSerivce.insert(book);
    return "redirect:querybook";
}

    }

    @RequestMapping(value ="/toHome")
    public String toHome(HttpSession session ){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.JAPAN);
        log.info("home");
        return  "home";
    }

    @RequestMapping("/change")
    public String change(HttpSession session ,@RequestParam("type") String type) {
      if(type.equals("zh"))
          session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.JAPAN);
      else
          session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);

        return "book/book";
    }
    @RequestMapping("/toBooKlist")
    public  String toBooklist(){
        log.info("书本列表");
     return "book/booklist";
    }
    @RequestMapping("/toBooAdd")
    public  String toBooAdd(){
        log.info("跳转页面");
        return "book/book";
    }
    @RequestMapping("/querybook")
   public ModelAndView queryBookPager(Book book ,HttpServletRequest request){
       PageBean  pb=new PageBean();
       pb.setRequest(request);

       List<Book> querybookpage = bookSerivce.querybookPager(book, pb);
        for (Book book1 : querybookpage) {
            System.out.println(book1.toString());
        }
       ModelAndView mv=new ModelAndView();
   mv.setViewName("book/booklist");
   mv.addObject("books",querybookpage);
   mv.addObject("pb",pb);
return  mv;
   }

}
