package com.zking.asset.dictionarydictionary.contorller;

import com.github.pagehelper.PageInfo;
import com.zking.asset.dictionarydictionary.model.Dict;
import com.zking.asset.dictionarydictionary.service.IDictService;
import com.zking.asset.system.util.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/Dict")
public class Dictcontorller {

    @Autowired
    private IDictService iDictService;

    @RequestMapping("/addDict")
    public String addDict(Dict dict, HttpServletRequest request){
        log.info("字典新增");
        log.info(""+dict);

        iDictService.insert(dict);


        return "redirect:listDict";
    }

    @RequestMapping("/listDict")
    public String listDict(Dict dict,HttpServletRequest request){
        PageBean pageBean=new PageBean();
        log.info("字典查询");
        List<Dict> dicts = iDictService.queryDictPages(dict, pageBean);
        PageInfo pageInfo = new PageInfo(dicts);
        System.out.println("页码：" + pageInfo.getPageNum());
        System.out.println("页大小：" + pageInfo.getPageSize());
        System.out.println("总记录：" + pageInfo.getTotal());
        request.setAttribute("Dicts",dicts);
        pageBean.setTotal((int) pageInfo.getTotal());
        pageBean.setRows(pageInfo.getPageSize());
        pageBean.setPage(pageInfo.getPageNum());
        request.setAttribute("pageBean",pageBean);
        return "/Book/booklist";
    }


    /*@RequestMapping("/toAddBook")
    public String toAddBook(){
        log.info("页面跳转演示");
        //转发：forward:/path    /交请求方法名
        //重定向:redirect:path
        //1.使用以上两种方式跳转页面，path代表请求方法名 而非逻辑视图名
        //2.同一个controller下的跳转，不需要加入/;不同的Controller之间的跳跳转必须加/
        //3.会绕开视图解析器，但最终还是要走视图解析器才能跳转页面
        *//*return "forward:toHome";*//*
        *//*return "redirect:toHome";*//*
        return "forward:/Books/booklist";
    }*/
}
