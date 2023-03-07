/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.26
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day010 {
    public static void main(String[] args) {
        /*
            方法重载：
                优点；
                    1，代码美观简洁整齐
                    2，功能相似的方法可以重名，，易于之后的代码编写
                使用：
                    在同一个类中，多个功能相似，可以使用方法重载机制
                    1，同一个类中
                    2，方法名相同
                    3，参数列表不同：
                        1，参数个数不同
                        2，参数顺序不同
                        3，参数类型不同
                注意：方法重载overload不能随便使用。
                     方法重载和返回值无关
                     方法重载和修饰符列表无关

              println()是一个方法，sun公司的java团队写好的

            在java中，编译器会通过方法名进行区分。
            但是在Java语言中允许多个方法名相同的情况出现。
            如果方法名相同的情况下，编译器会通过方法的参数类型进行方法的区分

            方法递归：recursion
                方法自己调用自己，就是方法递归
                注意：当递归时程序没有结束条件时，一定会发生栈溢出错误
                    递归一定要有结束条件
                    不建议在开发中轻易使用递归，但有时候不使用递归的话，程序无法实现

               当你在开发中遇到 stackOverFlowError错误，你有什么解决方案？
                    第一步：先检查递归的结束条件是否正确；
                    第二步，递归结束条件正确时，可以调整JVM 的栈内存初始化大小
                    第三步：调整大小后，还是有报错，只能继续调整栈内存初始化大小

                        java -X 可以调整栈内存大小
         */
    }

    //定义计算int类型的求和方法
    public static int sum(int x, int y) {
        return x + y;
    }

    //定义计算long类型的求和方法
    public static long sum(long x, long y) {
        return x + y;
    }

    //定义计算double类型的求和方法
    public static double sum(double x, double y) {
        return x + y;
    }

    //定义一个计算1-n的求和方法
    /*public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n;i++){
            sum += i;
        }
        return sum;
    }*/
    //方法递归
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    //求n的阶乘
    public static int factorial(int n){
        int sum = 1;
        for (int i = 1;i<=n;i++){
            sum *= i;
        }
        return sum;
    }
}
