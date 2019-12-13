package com.zking.asset.book.contorller;

import com.zking.asset.book.model.Book;
import com.zking.asset.book.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Book")
@Slf4j
public class Bookscontorller {

    @Autowired
    private IBookService iBookService;

    @RequestMapping("/Booklist")
    public String queryBookList(HttpServletRequest request){
        List<Book> books = iBookService.queryBookList();
        log.info("book{}"+books);
        request.setAttribute("BookList",books);
        return "Book/BookLists";
    }

    @RequestMapping("/BookAdd")
    public String BookAdd(@Validated(value = Book.ValidateGroups.Del.class) Book book, BindingResult bindingResult){


        if(bindingResult.hasErrors()){
            bindingResult.rejectValue("bookname",null,"书本名称不能重复");
            return "Book/Bookadd";
        }else{

            iBookService.BookAdd(book);
            return "redirect:Booklist";
        }

    }


    /**
     * @ResponseBody返会json
     * 不会走视图解析器
     * @return
     */
    @RequestMapping("/querySingleBook")
    @ResponseBody
    public List<Book> querySingleBook(){
        return iBookService.queryBookList();
    }

    @RequestMapping("/querySingleMap")
    @ResponseBody
    public Map<String,Object> querySingleMap(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",1);
        map.put("msg","ok");
        return map;
    }




}
