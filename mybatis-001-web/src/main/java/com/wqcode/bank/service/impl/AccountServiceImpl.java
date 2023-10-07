package com.wqcode.bank.service.impl;

import com.wqcode.bank.dao.AccountDao;
import com.wqcode.bank.dao.impl.AccountDaoImpl;
import com.wqcode.bank.exception.MoneyNotEnoughException;
import com.wqcode.bank.exception.TransferException;
import com.wqcode.bank.pojo.Account;
import com.wqcode.bank.service.AccountService;
import com.wqcode.bank.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;


/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class AccountServiceImpl implements AccountService {

    //private AccountDao accountDao = (AccountDao) new AccountDaoImpl();
    //Mybatis提供了代理模式，在内存中生产dao接口的代理类，然后创建代理类的实例
    //代码按照这样写就行：
    private AccountDao accountDao = SqlSessionUtil.openSession().getMapper(AccountDao.class);

    @Override
    public void transfer(String formActno, String toActno, double money) throws TransferException, MoneyNotEnoughException {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        //判断转出账户的余额是否充足(select)
        Account formAct = accountDao.selectByActno(formActno);
        if (formAct.getBalance() < money) {
            //余额不足
            throw new MoneyNotEnoughException("余额不足！");
        }
        //余额充足，进行转账 （update）
        //先更新内存中java对象的account的余额
        Account toAct = accountDao.selectByActno(toActno);
        formAct.setBalance(formAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        int count = accountDao.updateByActno(formAct);
        count += accountDao.updateByActno(toAct);
        //转账失败
        if(count != 2){
            throw new TransferException("转账失败！");
        }

        //提交事务
        sqlSession.commit();

        //工具类需要关闭
        SqlSessionUtil.close(sqlSession);

    }
}
