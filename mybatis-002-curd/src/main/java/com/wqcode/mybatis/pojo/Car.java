package com.wqcode.mybatis.pojo;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Car {
    private long id;
    private String carNum;
    private String brand;
    private double guidePrice;
    private String produceTime;
    private String carType;

    public Car() {
    }

    public Car(long id, String carNum, String brand, double guidePrice, String produceTime, String carType) {
        this.id = id;
        this.carNum = carNum;
        this.brand = brand;
        this.guidePrice = guidePrice;
        this.produceTime = produceTime;
        this.carType = carType;
    }
}
