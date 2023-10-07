package com.wqcode.mybatis.mapper;

import com.wqcode.mybatis.pojo.Student;

import java.util.List;

public interface StudentMapper {

    /**
     * 根据num获取学生信息，同时获取学生班级信息
     * */
    Student selectByNum(Integer num);

    /**
     * 一条SQL语句 association
     * */
    Student selectByIdAssociation(Integer num);

    /**
     * 分布查询，第一步，根据学生ID查班级ID
     * */
    Student selectByIdStep1(Integer num);

    List<Student> selectByClassnum(Integer classno);
}
