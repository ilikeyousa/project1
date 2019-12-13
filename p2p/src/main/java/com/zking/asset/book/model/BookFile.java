package com.zking.asset.book.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BookFile implements Serializable{
    private String fileId;

    private String realName;

    private String contentType;

    private Date createdate;

    public BookFile(String fileId, String realName, String contentType, Date createdate) {
        this.fileId = fileId;
        this.realName = realName;
        this.contentType = contentType;
        this.createdate = createdate;
    }

    public BookFile() {
        super();
    }


}