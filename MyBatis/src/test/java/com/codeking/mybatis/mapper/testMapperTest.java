package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.test;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;

import static com.codeking.mybatis.utils.HandlerMapperUtils.getSqlSession;

/**
 * @author : codeking
 * @create : 2022/11/23 22:13
 */
public class testMapperTest {
    @Test
    public void addTest() {
        SqlSession sqlSession=getSqlSession();
        testMapper testMapper1 = sqlSession.getMapper(testMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = testMapper1.addTest();
        //sqlSession.commit();
        System.out.println("结果：" + result);
    }

    @Test
    public void deleteById() {
        SqlSession sqlSession=getSqlSession();
        testMapper testMapper1 = sqlSession.getMapper(testMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result= testMapper1.deleteById();
        //sqlSession.commit();
        System.out.println("成功！"+result);
    }

    @Test
    public void updateTest() {
        SqlSession sqlSession=getSqlSession();
        testMapper testMapper1 = sqlSession.getMapper(testMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result= testMapper1.updateTest();
        //sqlSession.commit();
        System.out.println("成功！"+result);
    }

    @Test
    public void getAllTest(){
        SqlSession sqlSession=getSqlSession();
        testMapper testMapper1 = sqlSession.getMapper(testMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        ArrayList<test> result= testMapper1.getAll();
        System.out.println("查询结果 "+result);
    }

    @Test
    public void getSingleTest(){
        SqlSession sqlSession=getSqlSession();
        testMapper testMapper1 = sqlSession.getMapper(testMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        test result= testMapper1.getSingleTest();
        System.out.println("查询结果 "+result);
    }
}