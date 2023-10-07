package com.wqcode.mybatis.test;

import com.wqcode.mybatis.mapper.CarMapper;
import com.wqcode.mybatis.pojo.Car;
import com.wqcode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class CarMapperTest {

    @Test
    public void testInsert(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //面向接口获取接口的代理对象
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(6L,"108","BWM",34.0,"2023-10-01","燃油车");

        int count = mapper.insert(car);
        sqlSession.commit();
    }
}
