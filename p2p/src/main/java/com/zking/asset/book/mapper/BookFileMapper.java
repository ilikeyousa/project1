package com.zking.asset.book.mapper;

import com.zking.asset.book.model.BookFile;
import org.springframework.stereotype.Repository;

@Repository
public interface BookFileMapper {

    //新增书本文件信息
    int insert(BookFile record);


    //根据文件id获取书本文件信息
    BookFile selectByPrimaryKey(String fileId);




}