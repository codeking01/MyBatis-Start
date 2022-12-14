package com.codeking.mybatis.pojo;

import java.io.Serializable;

/**
 * @author : codeking
 * @create : 2022/11/26 15:07
 */
public class Emp implements Serializable {
    private Integer empId;
    private String empName;
    private Integer age;
    private String sex;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", dept=" + dept +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp(Integer empId, String empName, Integer age, String sex, Dept dept) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.dept = dept;
    }
    public Emp(Integer empId, String empName, Integer age, String sex ) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
    }

    public Emp() {
    }
}
