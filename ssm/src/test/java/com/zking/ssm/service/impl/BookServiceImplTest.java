package com.zking.ssm.service.impl;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookSerivce;
import com.zking.ssm.util.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;
@Slf4j
public class BookServiceImplTest  extends  BaseTest{

    @Autowired
    private IBookSerivce bookSerivce;

    private Book book;




    @Before
    public void setUp() throws Exception {
        book =new Book();

    }

    @Test
    public void querybook() {
        PageBean pb=new PageBean();
        List<Book> books = bookSerivce.querybookPager(book, pb);
    log.info("pbz总记录数:{}",pb.getTotal());
        for (Book book1 : books) {
            System.out.println(book1);
        }


//        Book book1 = bookSerivce.querybook(21);
//       log.info("book={}",book1);
//        System.out.println(book1);
//        System.out.println("------------------");
//        Book book2 = bookSerivce.querybook(13);
////        log.info("book={}",book2);
    }




}