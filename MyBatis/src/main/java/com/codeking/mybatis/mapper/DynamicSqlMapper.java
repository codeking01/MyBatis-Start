package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : codeking
 * @create : 2022/11/26 22:10
 */
public interface DynamicSqlMapper {
    // 多条件查询
    ArrayList<Emp> getEmpByCondition(Emp emp);
    ArrayList<Emp> getEmpByConditionWhere(Emp emp);
    ArrayList<Emp> getEmpByConditionTrim(Emp emp);
    ArrayList<Emp> getEmpByConditionChoose(Emp emp);
    int insertEmpByConditionForeach(@Param("empList") List<Emp> empList);
    //批量删除
    int delEmpByConditionForeach(@Param("eidList") Integer[] eidList);
}
