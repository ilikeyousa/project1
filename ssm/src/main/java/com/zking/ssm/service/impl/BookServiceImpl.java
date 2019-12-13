package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookSerivce;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements IBookSerivce{

    @Autowired
private BookMapper bookMapper;

    @Override
    public Book querybook(Integer bid) {
        return bookMapper.querybook(bid);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public List<Book> querybookPager(Book book,PageBean pb) {
        return bookMapper.querybookPager(book);
    }
}
