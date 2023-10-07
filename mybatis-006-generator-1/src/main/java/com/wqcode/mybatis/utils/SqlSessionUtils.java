package com.wqcode.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class SqlSessionUtils {

    private SqlSessionUtils(){};

    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("temp/mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>();

    public static SqlSession openSession(){
        SqlSession session = local.get();
        if(session == null ){
            session = sqlSessionFactory.openSession();
        }
        local.set(session);
        return session;
    }

    public static void close(SqlSession session){
        if(session != null){
            session.close();
        }
        local.remove();
    }

}
