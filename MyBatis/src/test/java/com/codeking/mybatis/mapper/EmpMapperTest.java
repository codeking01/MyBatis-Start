package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;

import static com.codeking.mybatis.utils.HandlerMapperUtils.getSqlSession;

/**
 * @author : codeking
 * @create : 2022/11/26 15:32
 */
public class EmpMapperTest {

    @Test
    public void getAllEmp() {
        SqlSession sqlSession = getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp result = empMapper.getAllEmp(1);
        System.out.println("result: " + result);
    }
    @Test
    public void getEmpAndDeptByEid() {
        SqlSession sqlSession = getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp result = empMapper.getEmpAndDeptByEid(2);
        System.out.println("result: " + result);
    }
    @Test
    public void getEmpByStep() {
        SqlSession sqlSession = getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp result = empMapper.getEmpByStep(3);
        System.out.println("result: " + result);
    }
}