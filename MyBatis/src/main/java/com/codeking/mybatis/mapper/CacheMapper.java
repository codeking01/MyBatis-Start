package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author : codeking
 * @create : 2022/11/27 13:33
 */
public interface CacheMapper {
    Emp getEmpByEid(@Param("empId") Integer empId);
    void insertEmp(Emp emp);
}
