package com.wqcode.mybatis.mapper;

import com.wqcode.mybatis.pojo.Cid;

public interface ClassMapper {
    /**
    * 分布查询第二步，根据classNum查询班级信息
     * */
    Cid selectByCidStep2(Integer classNum);

    Cid selectByCollection(Integer classNum);

    /**
     * 分布查询第一步，根据班级num查询班级信息
     * */
    Cid selectByStep1(Integer classNum);
}
