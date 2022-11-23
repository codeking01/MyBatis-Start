package com.codeking.mybatis.pojo;

/**
 * @author : codeking
 * @create : 2022/11/23 16:18
 */
public class test {
    private Integer id;

    public test() {
    }

    public test(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                '}';
    }
}
