package com.wqcode.bank.dao.impl;

import com.wqcode.bank.dao.AccountDao;
import com.wqcode.bank.pojo.Account;
import com.wqcode.bank.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class AccountDaoImpl implements AccountDao {

    @Override
    public Account selectByActno(String actno) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Account account = sqlSession.selectOne("account.selectByActno", actno);
        return account;
    }

    @Override
    public int updateByActno(Account act) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        int count = sqlSession.update("account.updateByActno", act);
        sqlSession.commit();
        sqlSession.close();
        return count;
    }
}
