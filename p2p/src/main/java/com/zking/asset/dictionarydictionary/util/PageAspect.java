package com.zking.asset.dictionarydictionary.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.asset.system.util.PageBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageAspect {
    //Object/void com.zking.ssm.IBookService.queryBookByPager
    @Around("execution(* *..*Service.*Pages(..))")
    public Object invoke(ProceedingJoinPoint point) throws Throwable {
          //获取目标方法的执行参数
        Object[] args = point.getArgs();
        //定义PageBean
        PageBean pageBean=null;
        //循环遍历参数
        for (Object arg : args) {
            if(arg instanceof PageBean){
                pageBean=(PageBean)arg;
                break;
            }
        }
        //判断是否分页判断分页基本要素
        if(null!=pageBean&&pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
            //执行目标方法
            Object proceed = point.proceed(args);

            if(null!=pageBean&&pageBean.isPagination() &&null!=proceed&&proceed instanceof List){
               List list=(List) proceed;
                PageInfo pageInfo=new PageInfo(list);
                pageBean.setTotal(pageInfo.getTotal()+"");
            }
            return proceed;


    }

}
