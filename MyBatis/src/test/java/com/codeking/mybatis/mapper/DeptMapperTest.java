package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Dept;
import com.codeking.mybatis.pojo.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static com.codeking.mybatis.utils.HandlerMapperUtils.getSqlSession;

/**
 * @author : codeking
 * @create : 2022/11/26 16:58
 */
public class DeptMapperTest {

    @Test
    public void getDept() {
    }

    @Test
    public void getDeptByid() {
        SqlSession sqlSession = getSqlSession();
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        Dept result = deptMapper.getDeptByid(1);
        System.out.println("result: " + result);
    }
    @Test
    public void getDeptByStep() {
        SqlSession sqlSession = getSqlSession();
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        Dept result = deptMapper.getDeptByStep(1);
        System.out.println("result: " + result);
    }
}