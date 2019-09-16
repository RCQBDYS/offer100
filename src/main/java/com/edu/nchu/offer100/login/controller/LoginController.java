package com.edu.nchu.offer100.login.controller;

import com.edu.nchu.offer100.login.entities.Manager;
import com.edu.nchu.offer100.login.service.LoginService;
import org.apache.ibatis.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author wangshen
 * @date 2019/9/8 23:16
 * 主要功能说明：
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping({"/","/login.html"})
    public String index(){
        return "login";
    }

   @PostMapping("/login")
    public String login(String account, String password, HttpServletRequest request){
        /*将从页面中获取到的数据传到服务层中的logMapper
        中执行对SQL语句查询是否有该用户*/
        logger.info("account: " + account + "password: " + password);
        Manager manager = loginService.login(account,password);
        if(manager == null){
            logger.debug("不存在该用户");
            return "login";
        }
        logger.info(manager.toString());
        return "index";

   }

}
