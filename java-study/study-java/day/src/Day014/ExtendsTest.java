package Day014;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.03.07
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class ExtendsTest {
    public static void main(String[] args) {

    }
}
class Account{
    private String user;
    private double balance;
    public Account(String user, double balance){
        this.user = user;
        this.balance = balance;
    }
    public Account(String user){
        this.user = user;
    }
    public Account(double balance){
        this.balance = balance;
    }
    public Account(){}
    public void setUser(String user){
        this.user = user;
    }
    public String getUser(){
        return this.user;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
class CreditAccount extends Account{
    private double credit;
}
