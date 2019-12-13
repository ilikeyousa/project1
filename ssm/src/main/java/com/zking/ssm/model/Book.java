package com.zking.ssm.model;

import com.sun.istack.internal.NotNull;
import lombok.ToString;


import javax.validation.constraints.NotBlank;
import java.io.Serializable;
@ToString
public class Book implements Serializable{
    private Integer bid;

     @NotBlank(message = "书本名称不能为空")
    private String bname;

     @NotBlank(message = "书本类型不能为空")
    private String btype;

    public Book(Integer bid, String bname, String btype) {
        this.bid = bid;
        this.bname = bname;
        this.btype = btype;
    }

    public Book() {
        super();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }
}