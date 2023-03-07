package Day013;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Person {
    /*
        表示人的类
        没有进行封装，person中的属性在外部程序中可以随意访问

     */
    //姓名
    private String  name;
    //年龄
    int age;
    //静态变量
    static int k;
    //性别
    boolean sex;
    //get实例方法
    public String getName() {
        return name;
    }
    //set方法
    public void setName(String n1){
        name = n1;
    }


    //  封装


}
