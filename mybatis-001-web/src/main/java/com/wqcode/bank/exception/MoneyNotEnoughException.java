package com.wqcode.bank.exception;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class MoneyNotEnoughException extends Exception {
    public MoneyNotEnoughException() {
    }

    ;

    public MoneyNotEnoughException(String message) {
        super(message);
    }

    ;

}
