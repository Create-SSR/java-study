package com.wqcode.bank.service;

import com.wqcode.bank.exception.MoneyNotEnoughException;
import com.wqcode.bank.exception.TransferException;

import javax.management.MalformedObjectNameException;

public interface AccountService {
    /**
     * 账户转账接口
     * @param fromActno 转出账户
     * @param toActno 转出账户
     * @param money 转账金额
     * */
    void transfer(String fromActno, String toActno,double money) throws TransferException, MoneyNotEnoughException;
}
