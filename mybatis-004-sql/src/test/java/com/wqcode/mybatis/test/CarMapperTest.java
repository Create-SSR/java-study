package com.wqcode.mybatis.test;

import com.wqcode.mybatis.mapper.CarMapper;
import com.wqcode.mybatis.pojo.Car;
import com.wqcode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class CarMapperTest {

    @Test
    public void testInsertBatch() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        List<Car> carList = new ArrayList<>();
        Car car1 = new Car(6L,"105","宝马",320.0,"2000-09-12","燃油车");
        Car car2 = new Car(7L,"106","宝骏",3.0,"2000-09-12","燃油车");
        Car car3 = new Car(8L,"107","野马",300.0,"2000-09-12","燃油车");
        Car car4 = new Car(9L,"108","GTR",3000.0,"2000-09-12","燃油车");
        Car car5 = new Car(10L,"109","玛莎拉蒂",1030.0,"2000-09-12","燃油车");
        Car car6 = new Car(11L,"110","保时捷",300.0,"2000-09-12","燃油车");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        int count = mapper.insertBatch(carList);
        sqlSession.commit();
        sqlSession.close();


    }

    @Test
    public void testDeleteByIds() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        Long[] ids = {3L};
        int count = mapper.deleteByIds(ids);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testSelectByChoose() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        List<Car> list = mapper.selectByChoose("丰田",null,null);
        list.forEach(car -> System.out.println(car));
        sqlSession.close();
    }
    @Test
    public void testUpdateBySet() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        Car car = new Car(5L,"104","奔驰",30.0,"2000-09-12","燃油吃");
        int count = mapper.updateBySet(car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByMultiCondition() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //三个条件都不为空
        //List<Car> list = mapper.selectByMultiCondition("丰田",20.0,"燃油车");
        //三个条件都为空
        List<Car> list1 = mapper.selectByMultiCondition("",null,"");

        //List<Car> list2 = mapper.selectByMultiCondition("丰田",20.0,"燃油车");
        //list.forEach(car -> System.out.println(list));
        list1.forEach(car -> System.out.println(list1));
        sqlSession.close();
    }
}
