package com.zking.ssm.mapper;

import com.zking.ssm.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    Book  querybook(Integer bid);
  List<Book>   querybookPager(Book book);

}