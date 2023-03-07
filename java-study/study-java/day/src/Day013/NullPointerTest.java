package Day013;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class NullPointerTest {
    public static void main(String[] args)  {
        //调用实例方法前，先new对象
        User user = new User();
        user = null;//会发生空指针异常保错
        user.doSome();

    }
}
//
class User{
    //实例变量
    int id;
    //实例方法
    public void doSome(){
        System.out.println("do some!");
    }
}
