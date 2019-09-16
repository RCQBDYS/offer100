package com.edu.nchu.offer100.login.mapper;


import com.edu.nchu.offer100.login.entities.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/*
* 说明：需要执行的SQL语句
* */

@Mapper
public interface LogInMapper {
    @Select("SELECT * FROM admin WHERE adminName = #{account} AND adminPassword = #{password}")
    Manager login(@Param("account") String account, @Param("password") String password);
}
