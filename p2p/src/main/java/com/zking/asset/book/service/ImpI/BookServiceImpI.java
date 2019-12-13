package com.zking.asset.book.service.ImpI;

import com.zking.asset.book.mapper.BookMapper;
import com.zking.asset.book.model.Book;
import com.zking.asset.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpI implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> queryBookList() {
        return bookMapper.queryBookList();
    }

    @Override
    public int BookAdd(Book book) {
        return bookMapper.BookAdd(book);
    }
}
