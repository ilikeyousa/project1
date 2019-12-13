package com.zking.asset.system.contorller;

import com.zking.asset.system.model.User;
import com.zking.asset.system.service.IUserService;
import com.zking.asset.system.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/page/user")
public class UserContorller {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/queryUserByPages")
    public void queryUserByPages(HttpServletRequest req, HttpServletResponse resp){
        List<User> users = iUserService.queryUserBy();
        for (User user : users) {
            System.out.println(user);
        }
        CommonUtils.toJSONObject(resp,true,users);
    }

}
