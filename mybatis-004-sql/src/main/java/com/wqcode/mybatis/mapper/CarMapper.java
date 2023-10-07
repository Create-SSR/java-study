package com.wqcode.mybatis.mapper;

import com.wqcode.mybatis.pojo.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {

    /**
     * 根据多条件进行查询
     * @param brand 品牌
     * @param guidePrice 指导价
     * @param carType 汽车类型
     * */
    List<Car> selectByMultiCondition(@Param("brand") String brand,@Param("guidePrice") Double guidePrice,@Param("carType") String carType);
    /**
     * 使用set标签
     * */
    int updateBySet(Car car);
    /**
     * 使用choose when otherwise标签
     * */
    List<Car> selectByChoose(@Param("brand") String brand,@Param("guidePrice") Double guidePrice,@Param("carType") String carType);

    int deleteByIds(@Param("ids") Long[] ids);

    int insertBatch(@Param("carList") List<Car> carList);
}
