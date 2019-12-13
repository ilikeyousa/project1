package com.zking.ssm.util;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageAspect {
    @Around("execution(* *..*Serivce.*Pager(..))")
  public Object  invoke(ProceedingJoinPoint point) throws Throwable {
      Object [] args =point.getArgs();
       PageBean pb=null;
        for (Object arg : args) {
               if(arg instanceof  PageBean){
                   pb = (PageBean) arg;
                   break;
               }
        }
        if(null!=pb&&pb.isPagination())
            PageHelper.startPage(pb.getPage(),pb.getRows());
        Object proceed = point.proceed(args);

        if(null!=pb&&pb.isPagination()&&null!=proceed&&proceed instanceof List){
            List list= (List) proceed;
            PageInfo  pageInfo=new PageInfo(list);
            pb.setTotal(pageInfo.getTotal()+"");
        }

          return   proceed;
    }



}
