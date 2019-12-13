package com.zking.asset.book.service;

import com.zking.asset.book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> queryBookList();
    int BookAdd(Book book);
}