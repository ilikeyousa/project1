package com.zking.asset.dictionarydictionary.service.ImpI;

import com.zking.asset.dictionarydictionary.mapper.DictMapper;
import com.zking.asset.dictionarydictionary.model.Dict;
import com.zking.asset.dictionarydictionary.service.IDictService;
import com.zking.asset.system.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpI implements IDictService{
    @Autowired
    private DictMapper iDictService;

    @Override
    public int insert(Dict record) {
        return iDictService.insert(record);
    }



    @Override
    public List<Dict> queryDictPages(Dict dict, PageBean pageBean) {
        return iDictService.queryDictPages();
    }
}
