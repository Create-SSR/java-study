package com.wqcode.bank.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 * SQL语句执行工具类
 */
public class SqlSessionUtil {
    private SqlSessionUtil(){}

    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //全局的，服务器级别的，一个服务器当中定义1个即可
    private static ThreadLocal<SqlSession> local = new ThreadLocal<>();
    public static SqlSession openSession() {
        SqlSession sqlSession = local.get();
        if(sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession();
            //将SQLsession对象绑定到当前线程
            local.set(sqlSession);

        }
        return sqlSession;
    }

    public static void close(SqlSession sqlSession){
        if(sqlSession != null) {
            sqlSession.close();
            //移除sqlsession对象和当前线程的绑定关系
            //tomcat支持多线程，用过的线程之后可能再次被使用，所以需要移除绑定关系
            local.remove();
        }
    }

}
