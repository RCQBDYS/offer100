package com.edu.nchu.offer100.login.service.inter;

import com.edu.nchu.offer100.login.entities.Manager;
import com.edu.nchu.offer100.login.mapper.LogInMapper;
import com.edu.nchu.offer100.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangshen
 * @date 2019/9/16 16:04
 * 主要功能说明：
 */
@Service
public class LoginServiceInter implements LoginService {
    @Autowired
    LogInMapper logInMapper;


    @Override
    public Manager login(final String account,final String password){
        return logInMapper.login(account,password);
    }
}
