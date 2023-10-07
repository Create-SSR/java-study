package com.wqcode.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqcode.mybatis.mapper.CarMapper;
import com.wqcode.mybatis.pojo.Car;
import com.wqcode.mybatis.pojo.CarExample;
import com.wqcode.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class CarMapperTest {

    @Test
    public void testSelectAll() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        int pageNum = 2;
        int pageSize = 2;
        PageHelper.startPage(pageNum, pageSize);

        List<Car> carlist = mapper.selectAll();
        //carlist.forEach(car -> System.out.println(car));

        PageInfo<Car> carPageInfo = new PageInfo<>(carlist, 3);
        System.out.println(carPageInfo);


        sqlSession.close();
    }
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //查询一个
        Car car = mapper.selectByPrimaryKey(1L);
        System.out.println(car);

        //查询所有  条件是null表示没有条件
        List<Car> carList = mapper.selectByExample(null);
        carList.forEach(car1 -> System.out.println(car1));

        //按条件查询 ： 封装条件，通过CarExample对象来封装查询条件
        //  QBC 风格：Query By Criteria 一中查询方式，面向对象，看不到SQL语句

        CarExample carExample = new CarExample();
        //调用createCriteria方法创建条件
        carExample.createCriteria()
                .andBrandLike("丰田")
                .andGuidePriceBetween(new BigDecimal(10.0),new BigDecimal(90.0));

        carExample.or().andCarTypeEqualTo("燃油车");

        List<Car> carList1 = mapper.selectByExample(carExample);
        carList1.forEach(car2 -> System.out.println(car2));



        sqlSession.close();


    }
}
