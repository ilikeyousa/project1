package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IBookSerivce {
    Book querybook(Integer bid);
    int insert(Book record);
    List<Book> querybookPager(Book book, PageBean pb);

}
