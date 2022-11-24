package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : codeking
 * @Create : 2022/11/23 15:55
 */
public interface UserMapper {
    int insertUser(String username, String password, Integer age, char sex, String email);

    int insertUserByEntity(User user);

    int deleteUserById(@Param("id") Integer id);

    int updateUserById(@Param("username") String username, @Param("password") String password, @Param("age") Integer age, @Param("sex") char sex, @Param("email") String email, @Param("id") Integer id);

    User getById(@Param("id") Integer id);

    //查询一条数据为map集合
    HashMap<String, Object> getUserToMap(@Param("id") int id);

    ArrayList<User> getAllUser();

    //查询多条数据为map集合
    ArrayList<HashMap<String, Object>> getAllUserToMap();
    @MapKey("id")
    HashMap<String,Object> getAllUserToHashMap();
}
