package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Emp;

import java.util.ArrayList;

/**
 * @author : codeking
 * @create : 2022/11/26 22:10
 */
public interface DynamicSqlMapper {
    // 多条件查询
    ArrayList<Emp> getEmpByCondition(Emp emp);
}
