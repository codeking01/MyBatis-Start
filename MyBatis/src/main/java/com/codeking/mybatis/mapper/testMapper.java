package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.test;
import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;

/**
 * @author : codeking
 * @create : 2022/11/23 16:18
 */
public interface testMapper {
    int addTest();
    int deleteById();
    int updateTest();
    ArrayList<test> getAll();
    test getSingleTest();
}
