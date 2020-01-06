package com.kaka.hello.mapper;

import com.kaka.hello.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMappter {
    @Select("select * from tb_user")
    List<User> getAllUsers();

    @Delete("delete from tb_user where id = #{id}")
    void delete(Integer id);
}
