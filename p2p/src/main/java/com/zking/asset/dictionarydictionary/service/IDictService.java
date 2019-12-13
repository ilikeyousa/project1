package com.zking.asset.dictionarydictionary.service;

import com.zking.asset.dictionarydictionary.model.Dict;
import com.zking.asset.system.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IDictService {

    int insert(Dict record);


    List<Dict> queryDictPages(Dict dict, PageBean pageBean);



}