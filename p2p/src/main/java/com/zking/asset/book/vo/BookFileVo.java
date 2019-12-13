package com.zking.asset.book.vo;


import com.zking.asset.book.model.BookFile;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BookFileVo extends BookFile {

    private Integer id;

    private MultipartFile bookFile;
}
