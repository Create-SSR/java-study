package com.wqcode.mybatis.pojo;

import java.util.List;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Cid {
    private Integer classNum;
    private String className;

    private List<Student> students;

    @Override
    public String toString() {
        return "Cid{" +
                "classNum=" + classNum +
                ", className='" + className + '\'' +
                ", students=" + students +
                '}';
    }

    public Cid() {
    }

    public Cid(Integer classNum, String className) {
        this.classNum = classNum;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
