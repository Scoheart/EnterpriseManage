package com.scoheart.dao;

import com.scoheart.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminMapper {
    Admin selectAdmin();


    /*登录功能*/
    @Select("select * from tb_admin where admin_username = #{username} and admin_password = #{password}")
    @ResultMap("AdminResultMap")
    Admin selectByAdmin(@Param("username")String username, @Param("password")String password);


    void insertAdmin(Admin admin);

    Admin selectByUsername(@Param("username")String username);
}
