package com.zking.asset.dictionarydictionary.mapper;

import com.zking.asset.dictionarydictionary.model.Dict;
import com.zking.asset.system.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapper {

    int insert(Dict record);

    List<Dict> queryDictPages();


}