package com.wqcode.javassist;

import com.wqcode.bank.dao.AccountDao;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 *
 *  Mybatis提供了代理模式，在内存中生产dao接口的代理类，然后创建代理类的实例
 */
public class JavassistTest {

    @Test
    public void testGenerateImpl() throws Exception {
        //获取类库
        ClassPool pool = ClassPool.getDefault();
        //制造类
        CtClass ctClass = pool.makeClass("com.wqcode.bank.dao.impl.AccountDaoImpl");
        //制造接口
        CtClass ctInstance = pool.makeInterface("com.wqcode.bank.dao.AccountDao");
        //添加接口到类中
        ctInstance.addInterface(ctInstance);
        //实现接口中的方法
        //制造方法
        CtMethod method = CtMethod.make("public void delete(){System.out.println(\"hello,world\");}",ctClass);
        //将方法以傲家到类中
        ctClass.addMethod(method);
        //在内存中生成类，同时将类加载
        Class<?> clazz = ctClass.toClass();
        AccountDao accountDao = (AccountDao) clazz.newInstance();


    }

    @Test
    public void testGenerateFirstClass() throws Exception{
        //获取类池，可以用来生成class
        ClassPool pool = ClassPool.getDefault();
        //制造类
        CtClass ctClass = pool.makeClass("com.wqcode.dao.impl.AccountDaoImpl");
        //制造方法
        String methodCode = "public void insert(){System.out.println(123);}";

        CtMethod ctMethod = CtMethod.make(methodCode,ctClass);
        //将方法添加到类中
        ctClass.addMethod(ctMethod);
        //在内存中生产class
        ctClass.toClass();

        //类加载
        Class<?> clszz = Class.forName("com.wqcode.dao.impl.AccountDaoImpl");

        //创建对象
        Object obj = clszz.newInstance();

        //获取insert()方法
        Method insertMethod = clszz.getDeclaredMethod("insert");

        //调用方法：
        insertMethod.invoke(obj);





    }
}
