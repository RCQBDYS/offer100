package com.edu.nchu.offer100.login.service;

import com.edu.nchu.offer100.login.entities.Manager;

public interface LoginService {
    Manager login(String adminName,String adminPassword);
}
