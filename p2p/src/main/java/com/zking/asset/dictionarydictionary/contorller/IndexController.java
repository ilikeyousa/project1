package com.zking.asset.dictionarydictionary.contorller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
@Slf4j

public class IndexController {
    @RequestMapping("/home/index.shtml")
    public String aa(HttpSession session){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.CHINA);
        log.info("index");
        return "login";
    }

    @RequestMapping("/changLocale")
    public String changLocale(HttpSession session,@RequestParam("type") String type){
        if(type.equals("jp"))
         session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.JAPAN);
        else
         session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.CHINA);

        return "indexs";
    }

}
