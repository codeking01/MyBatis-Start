package com.codeking.mybatis.mapper;

import com.codeking.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @author : codeking
 * @create : 2022/11/26 16:14
 */
public interface DeptMapper {
    ArrayList<Dept> getDept(@Param("deptId") Integer deptId);
    Dept getDeptByid(@Param("deptId") Integer deptId);
    Dept getDeptByStep(@Param("deptId") Integer deptId);

}
