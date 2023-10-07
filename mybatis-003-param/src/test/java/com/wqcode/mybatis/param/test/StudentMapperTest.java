package com.wqcode.mybatis.param.test;

import com.wqcode.mybatis.param.mapper.StudentMapper;
import com.wqcode.mybatis.param.pojo.Student;
import com.wqcode.mybatis.param.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class StudentMapperTest {

    @Test
    public void testSelectTotal() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper student = sqlSession.getMapper(StudentMapper.class);

        Long total = student.selectTotal();
        System.out.println(total);
        sqlSession.close();
    }

    @Test
    public void testSelectAllByResultMap() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper student = sqlSession.getMapper(StudentMapper.class);

        List<Student> list = student.selectAllByResultMap();
        list.forEach(Student -> System.out.println(list));
        sqlSession.close();
    }

    @Test
    public void testSelectAllRetMap() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();

        StudentMapper student = sqlSession.getMapper(StudentMapper.class);

        Map<Long,Map<String,Object>> maps = student.selectAllRetMap();

        System.out.println(maps);
        sqlSession.close();

    }

    @Test
    public void testSelectByRetListMap() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Map<String,Object>> list = mapper.selectAllRetListMap();
        list.forEach(map -> System.out.println(list));
        sqlSession.close();
    }

    @Test
    public void testSelectByNameAndSex2() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        //mapper 对象实际上指向了代理对象
        //mapper是代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        //selectByNameAndSex2是代理方法
        List<Student> student = studentMapper.selectByNameAndSex2("张三",'男');
        student.forEach(Student -> System.out.println(student));
        sqlSession.close();

    }

    @Test
    public void testSelectByNameAndSex() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = studentMapper.selectByNameAndSex("张三",'男');
        student.forEach(Student -> System.out.println(student));
        sqlSession.close();

    }

    @Test
    public void testInsertByPojo() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = sdf.parse("1998-10-11");

        Student student = new Student(4L,"赵六",21,1.88,birth,'男');
        studentMapper.insertStudentByPojo(student);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testInsertByMap() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",3L);
        map.put("姓名","王五");
        map.put("年龄",20);
        map.put("身高",1.90);
        map.put("性别",'男');
        map.put("生日","1998-09-09");

        studentMapper.insertStudentByMap(map);
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void testSelectBySex() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Character sex = Character.valueOf('男');
        List<Student> student = studentMapper.selectBySex(sex);
        student.forEach(Student -> System.out.println(student));
        sqlSession.close();

    }



    @Test
    public void testSelectByBirth() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = sdf.parse("1998-10-11");

        List<Student> student = studentMapper.selectByBirth(birth);
        student.forEach(Student -> System.out.println(student));
        sqlSession.close();

    }


    @Test
    public void testSelectByName() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = studentMapper.selectByName("张三");
        student.forEach(Student -> System.out.println(student));
        sqlSession.close();

    }

    @Test
    public void testStudentMapper() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = studentMapper.selectById(1L);
        student.forEach(Student -> System.out.println(student));
        sqlSession.close();

    }
}
