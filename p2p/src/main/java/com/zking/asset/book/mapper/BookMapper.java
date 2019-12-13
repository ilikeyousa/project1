package com.zking.asset.book.mapper;

import com.zking.asset.book.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    List<Book> queryBookList();

    //根据书本id修改对应的书本文件信息
    int updateBookImageById(Book book);

    int BookAdd(Book book);

}