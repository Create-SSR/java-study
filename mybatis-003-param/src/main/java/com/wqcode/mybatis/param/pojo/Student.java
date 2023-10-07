package com.wqcode.mybatis.param.pojo;

import java.util.Date;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private Double height;
    private Date birth;
    private Character sex;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birth=" + birth +
                ", sex=" + sex +
                '}';
    }

    public Student() {
    }

    public Student(Long id, String name, Integer age, Double height, Date birth, Character sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.birth = birth;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
