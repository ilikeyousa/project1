package com.zking.asset.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class Book implements Serializable{

    // 书本验证分组
    public static interface ValidateGroups {
        // 新增/修改
        public static interface Add {
        }

        // 修改
        public static interface Edit {
        }

        // 删除
        public static interface Del {
        }
    }
    @NotNull(message = ("书本编号不能为空"),groups = {ValidateGroups.Edit.class, ValidateGroups.Del.class})
    private Integer id;

    /*@JsonProperty("bname")*/  //起别名
    /*@JsonIgnore*/
    @NotBlank(message = "书本名称不能为空",groups = {ValidateGroups.Add.class, ValidateGroups.Edit.class})
    private String bookname;


   @NotNull(message = "书本价格不能为空",groups = {ValidateGroups.Del.class, ValidateGroups.Edit.class})
    private Float price;

   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")

    private String booktype;

    private String bookimage;

    public Book() {
    }

    public Book(Integer id, String bookname, Float price, String booktype, String bookimage) {

        this.id = id;
        this.bookname = bookname;
        this.price = price;
        this.booktype = booktype;
        this.bookimage = bookimage;
    }
}