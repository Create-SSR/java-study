package Day013;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class accountTest {
    public static void main(String[] args){
        //创建账户对象
        Account act = new Account(1000,2000,0.0123);
        //创建客户对象
        Customer customer = new Customer("James Smith",act);
        //存入100元
        customer.getAccount().deposit(100);
        //取出960元
        customer.getAccount().withdraw(960);
        //取出2000元
        customer.getAccount().withdraw(2000);




    }
}

//封装
//定义客户类
class Customer{
    //姓名
    private String name;
    //账户
    private Account act;
    //无参构造方法
    public Customer(){}
    //有参构造方法
    public Customer(String name,Account act){
        this.name = name;
        this.act = act;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAccount(Account act){
        this.act = act;
    }
    public Account getAccount(){
        return this.act;
    }
}
//定义账户类
class Account{
    //封装
    //账户
    private int  id;

    //余额
    private double balance;
    //年利率
    private double annualInterestRate;
    //无参构造方法
    public Account(){}
    //有参构造方法
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //get和set方法
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    //定义取款方法
    public void withdraw(double money){
        if(money > getBalance()){
            System.out.println("余额不足！！！请输入正确的数额");
            return;
        }
        this.setBalance(this.getBalance() - money);
        System.out.println("成功取出" + money + "元");
    }
    //定义存款方法
    public void deposit(double money){
        this.setBalance(this.getBalance() + money);
        System.out.println("成功存入" + money + "元");
    }

}
