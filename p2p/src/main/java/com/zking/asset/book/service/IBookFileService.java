package com.zking.asset.book.service;

import com.zking.asset.book.model.Book;
import com.zking.asset.book.model.BookFile;
import org.springframework.stereotype.Repository;

public interface IBookFileService {

    //新增书本文件信息
    int insert(BookFile record, Book book);


    //根据文件id获取书本文件信息
    BookFile selectByPrimaryKey(String fileId);




}