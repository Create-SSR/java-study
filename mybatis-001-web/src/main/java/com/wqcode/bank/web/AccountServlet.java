package com.wqcode.bank.web;

import com.wqcode.bank.exception.MoneyNotEnoughException;
import com.wqcode.bank.exception.TransferException;
import com.wqcode.bank.service.AccountService;
import com.wqcode.bank.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
@WebServlet("/transfer")
public class AccountServlet extends HttpServlet {

    private AccountService accountService =(AccountService) new AccountServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单数据
        String formActno = req.getParameter("formActno");
        String toActno = req.getParameter("toActno");
        Double money = Double.parseDouble(req.getParameter("money"));

        //调用service的转账方法；调用业务层

        try {
            accountService.transfer(formActno, toActno,money);
            //转账成功，调用view展示结果
            resp.sendRedirect(req.getContextPath() + "/success.html");
        } catch (TransferException e) {
            resp.sendRedirect(req.getContextPath() + "/error2.html");
        } catch (MoneyNotEnoughException e) {
            resp.sendRedirect(req.getContextPath() + "/error1.html");
        }

    }


}
