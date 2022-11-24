package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static com.codeking.mybatis.utils.HandlerMapperUtils.getSqlSession;

/**
 * @author : codeking
 * @create : 2022/11/24 13:54
 */
public class UserMapperParamsTest {

    @Test
    public void insertUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser("李白", "1234567", 26, '男', "147@qq.com");
        System.out.println("添加成功 " + result);
    }

    @Test
    public void insertUserByEntity() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUserByEntity(new User() {
            {
                this.setUserName("test");
                this.setPassword("test");
                this.setEmail("test@qq.com");
                this.setAge(18);
                this.setSex('女');
            }
        });
        System.out.println("添加成功 " + result);
    }

    @Test
    public void deleteUserByIdTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.deleteUserById(10);
        System.out.println("删除成功！" + result);
    }

    @Test
    public void updateUserByIdTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.updateUserById("commit", "update", 18, '男', "45@qq.com", 10);
        System.out.println("修改成功！" + result);
    }

    @Test
    public void getByIdTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User result = userMapper.getById(9);
        System.out.println("查找成功：" + result);
    }

    @Test
    public void getUserToMapTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> result = userMapper.getUserToMap(9);
        System.out.println("查找成功：" + result);
    }

    @Test
    public void getAllUserTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<User> result = userMapper.getAllUser();
        result.forEach(user -> System.out.println(user));
        //System.out.println("查找成功："+result);
    }

    @Test
    public void getAllUserToMapTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<HashMap<String, Object>> result = userMapper.getAllUserToMap();
        System.out.println("查找成功：" + result);
    }

    @Test
    public void getAllUserToHashMapTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> result = userMapper.getAllUserToHashMap();
        System.out.println("查找成功：" + result);
    }

    @Test
    public void fuzzySearchTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<User> result = userMapper.fuzzySearch("张");
        System.out.println("查找成功：" + result);
    }

    @Test
    public void deleteSpecialUserTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 批量删除，用逗号隔开即可
        int result = userMapper.deleteSpecialUser("3,5,4");
        System.out.println("查找成功：" + result);
    }

    @Test
    public void getFromTableNameTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 批量删除，用逗号隔开即可
        ArrayList<User> result = userMapper.getFromTableName("t_user");
        System.out.println("查找成功：" + result);
    }

    @Test
    public void insertUserGetIdTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new  User() {{
            this.setSex('男');
            this.setAge(18);
            this.setUserName("commit");
            this.setPassword("commit");
            this.setEmail("123@qq.com");
        }};
        System.out.println("插入前的id：" + user.getId());
        userMapper.insertUserGetId(user);
        System.out.println("插入后的id：" + user.getId());
    }
    @Test
    public void getAllUserByResultMapTest() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<User> result = userMapper.getAllUserByResultMap("张");
        System.out.println("结果：" + result);
    }
}