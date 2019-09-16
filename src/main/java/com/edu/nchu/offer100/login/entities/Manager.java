package com.edu.nchu.offer100.login.entities;

import lombok.Data;

/**
 * @author wangshen
 * @date 2019/9/16 15:48
 * 主要功能说明：登录的实体类
 */

@Data
public class Manager {
    private Integer adminId;
    private String adminName;
    private String adminPassword;
}
