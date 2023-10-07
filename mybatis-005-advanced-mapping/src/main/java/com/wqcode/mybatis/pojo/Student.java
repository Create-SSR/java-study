package com.wqcode.mybatis.pojo;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Student {

    private Integer num;
    private String name;

    private Cid clazz;

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", classN=" + clazz +
                '}';
    }

    public Student() {
    }

    public Student(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cid getClassNo() {
        return clazz;
    }

    public void setClassNo(Cid classNo) {
        this.clazz = classNo;
    }
}
