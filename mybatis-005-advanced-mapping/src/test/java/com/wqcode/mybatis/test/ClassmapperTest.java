package com.wqcode.mybatis.test;

import com.wqcode.mybatis.mapper.ClassMapper;
import com.wqcode.mybatis.pojo.Cid;
import com.wqcode.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class ClassmapperTest {

    @Test
    public void testSelectByStep() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.openSqlSession();
        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);

        Cid clazz = mapper.selectByCollection(102);
        System.out.println(clazz);
        sqlSession.close();
    }
    @Test
    public void testSelectByCollection() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.openSqlSession();
        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);

        Cid clazz = mapper.selectByCollection(100);
        System.out.println(clazz);
        sqlSession.close();
    }
}
