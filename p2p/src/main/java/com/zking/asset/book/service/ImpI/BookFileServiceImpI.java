package com.zking.asset.book.service.ImpI;

import com.zking.asset.book.mapper.BookFileMapper;
import com.zking.asset.book.mapper.BookMapper;
import com.zking.asset.book.model.Book;
import com.zking.asset.book.model.BookFile;
import com.zking.asset.book.service.IBookFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class BookFileServiceImpI implements IBookFileService{
    @Autowired
    private BookFileMapper bookFileMapper;
    @Autowired
    private BookMapper bookMapper;

    @Transactional
    @Override
    public int insert(BookFile record, Book book) {
        //书本DI
        String fileId= UUID.randomUUID().toString().replaceAll("-","");

        //2.新增书本文件信息
        record.setFileId(fileId);
        bookFileMapper.insert(record);

        //3.根据书本Id修改书本对应的图片信息
        book.setBookimage(fileId);
        bookMapper.updateBookImageById(book);
        return 0;
    }

    @Override
    public BookFile selectByPrimaryKey(String fileId) {
        return bookFileMapper.selectByPrimaryKey(fileId);
    }
}
