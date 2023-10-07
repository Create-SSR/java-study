package com.wqcode.mybatis.param.mapper;

import com.wqcode.mybatis.param.pojo.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
    /**
     * 当接口中的方法参数只有一个时，并且参数类型都是简单类型
     *
     * */


    //g根据ID查询
    List<Student> selectById(Long id);
    //根据name查询
    List<Student> selectByName(String name);
    //根据birth查询
    List<Student> selectByBirth(Date birth);
    //根据sex查询
    List<Student> selectBySex(Character sex);

    /**
     *  保存学生信息，通过map参数，以下是单个参数，但是参数类型不是简单类型，是map集合
     * */
    int insertStudentByMap(Map<String,Object> map);

    int insertStudentByPojo(Student student);

    /**
     * 多参数
     * mybabis框架会自动创建一个map集合，并且map集合是以这种方式存储参数的
     *      map.put("name","XXX");
     * */
    List<Student> selectByNameAndSex(String name,Character sex);


    /**
     * 多参数
     * mybabis框架会自动创建一个map集合，并且map集合是以这种方式存储参数的
     *      map.put("arg0","XXX");
     *      map.put("arg1","XXX");
     *      map.put("param0","XXX");
     *      map.put("param1","XXX");
     *
     *      可以使用Param注解
     * @Param name
     * @Param sex
     * */
    List<Student> selectByNameAndSex2(@Param("name") String name, @Param("sex") Character sex);


    //查询所有学生信息，返回一个List集合
    List<Map<String,Object>> selectAllRetListMap();

    //查询所有学生信息，返回一个Map集合
    @MapKey("id") //将查询结果的ID值 作为 整个 map集合的key
    Map<Long,Map<String,Object>> selectAllRetMap();

    /**
     * 查询所有的student信息，使用resultMap标签进行结果映射
     * */
    List<Student> selectAllByResultMap();

    Long selectTotal();
}
