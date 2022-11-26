package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @author : codeking
 * @create : 2022/11/26 15:10
 */
public interface EmpMapper {
    //1.使用级联处理映射关系
    Emp getAllEmp(@Param("empId") Integer empId);
    // 2.使用association处理映射关系
    Emp getEmpAndDeptByEid(@Param("empId") Integer empId);
    // 3.分步查询
    Emp getEmpByStep(@Param("empId") Integer empId);

    // 查询emp的所有
    Emp getEmpById(@Param("empId") Integer empId);

}
