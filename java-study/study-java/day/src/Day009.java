/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.25
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day009 {
    /*main方法执行结束的时候，不需要给JVM返回任何的执行结果*/
    public static void main(String[] args) {
        /*
            方法：method 是可以完成某个特定功能的并且可以重复利用的的代码片段；c语言中，方法被称为函数；java中叫做方法
                一个方法就是一个功能单元
                作用：代码复用
                方法定义在类体中即可，先后顺序没有关系；
                定义：
                    public static   void      main  (String[] args)         {}
                    [修饰符列表]     返回值类型  方法名  [（形式参数列表）] args是变量名    {
                        方法体；
                    }
               注意：【】中括号内容不是必须的，是可选的;
                     方法体由java语句构成
               修饰符列表：不是必写的，可选
               返回值类型：
                    1，可以是任何类型，只要是java中合法的数据类型就行，Java中包括八种基本数据类型和引用数据类型
                    2，返回值是一个方法执行结束之后的结果；通常是一个数据，称为值，叫返回值
                    3，当一个方法不需要返回任何返回值的时候，返回值类型也不能空白，必须写void关键字；
                        void表示该方法体结束后不需要返回任何结果
                    4，如果返回值不是void，，那么在方法体执行结束的时候必须使用return 值；这样的语句来完成值的返回，如果没有
                    return 值；那么编译器会报错；
                        return 值；作用：返回值；
                    5，如果返回值类型是void，那么方法体中不能有return 值；这样的语句。
                        当时可以有return；语句，return 语句是用来终结当前方法的
                    6，只要有return关键字的语句执行，当前方法必然结束
               方法定义之后需要去调用，不调用是不会执行
               方法执行之后，返回值给调用者

               方法名：
                    1，见名知意
                    2，第一个单词首字母小写，后面单词首字母大写；
                    3，合法标识符；
               形式参数表：(形参)
                    注意：个数 是0-n
                         形式参数中的每一个参数都是局部变量，方法结束之后内存释放
                         多个形参时，要用英文逗号隔开
                         形参的数据类型起决定作用，形参后的变量名都是随意的
               方法体由Java语句构成
               方法调用：
                    跨类调用语法：类名.方法名.（实际参数列表）；
                    同一个类中调用语法：方法名. （实际参数列表）；

               break 和 return 的区别：
                    break用来终止离他最近的一个循环或者switch
                    return用来终止离他最近的一个方法

         */
        sumInt(111, 222);
        /*int sum1 = sumInt(11,22);smInt方法没有返回值*/
        divide(10, 5);
        /*实参必须和形参一一对应*/
        int sum = Day009.divide(30, 15);
        System.out.println(sum);
        int result = m();
        System.out.println(result);
    }

    /*
         x,y,z在sumInt方法中属于局部变量
         方法调用结束之后，局部变量占用的内存会被释放掉
     */
    public static void sumInt(int x, int y) {
        /*求和*/
        int z = x + y;
        divide(12, 3);
        System.out.println(x + "+" + y + "=" + z);
    }

    public static int divide(int n, int m) {
        int b = n / m;
        System.out.println(n + "/" + m + "=" + b);
        //return b;
        return n / m;
    }
    //java: 缺少返回语句

    /*public static int m(){
        boolean flag = true;
        *//*
            对于编译器来说，不负责运算，只知道flag变量是boolean类型
            编译器会认为flag有可能是false或者true
         *//*
        if (flag) {
            *//*编译器认为可能输出结果，哟可能不输出；为了确保程序不出现任何异常，会报错：缺少返回语句*//*
            return 1;
        }
    }*/
    //三木运算符会让代码变得简洁
    public static int m() {
        boolean flag = true;
        return flag ? 1 : 0;
    }


}
