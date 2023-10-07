package com.wqcode.mybatis.mapper;

import com.mysql.cj.log.Log;

import java.util.List;

public interface LogMapper {
    /**
     *根据日期查询不同的表
     * @param date
     * @return Log
     * */

    List<Log> selectAllByTable(String date);

    List<Log> selectByBrand(String date);
}
