package com.wqcode.bank.dao;

import com.wqcode.bank.pojo.Account;

/**
 * 账户的Dao对象
 * 负责对数据库表中的数据进行增删改查，不包含业务逻辑
 * */
public interface AccountDao {
    /**
     * 根据账号查询账户余额
     * @param actno 账号
     * @return 账户信息
     * */
    Account selectByActno(String actno);

    /**
     * 更新账户金额信息
     * @param act 被更新账户对象
     * @return 1标识成功，其他表示失败
     * */
    int updateByActno(Account act);

    public static void main(String[] args) {
        System.out.println("agin");
    }

}
