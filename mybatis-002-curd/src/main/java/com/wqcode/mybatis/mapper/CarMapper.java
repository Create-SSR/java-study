package com.wqcode.mybatis.mapper;

import com.wqcode.mybatis.pojo.Car;

public interface CarMapper {

    int insert(Car car);

    int deleteById(Long id);

    int selectById(Long id);

    int update(Long id);

    int insertCarUseGeneratedKeys(Car car);

}
