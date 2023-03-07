/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.22
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day007 {
    public static void main(String[] args){
        /*
        循环语句： 解决代码的复用性
            for语句结构：
                for（初始化表达式；条件表达式；更新表达式）{
                    循环体（java语句）；
                }
             执行原理：
                1，初始化表达式最先执行，并且在整个循环中只执行一次
                2，条件表达式必须是一个布尔类型，true/false

         */
        //死循环
        //for(;;){
        //    System.out.println("hello world");
        //}
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
        //变形1
        for (int i = 0; i < n; ){
            System.out.println(i);
            i++;
        }
        //变形2
        for (int i = 0; i < n; ){
            i++;
            System.out.println(i);
        }
        //变形3
        int i = 0;
        for (; i < n; ){
            i++;
            System.out.println(i);
        }

        //for的其他形式
        //变形4
        for (; i < n; i--){
            System.out.println(i);
        }
        //变形5
        for (; i < n; i += 2){
            System.out.println(i);
        }
        //求1-100的所有奇数和
        int sum = 0;
        for (int k = 1; k <= 100; k++){
            if (k % 2 == 1){
                sum += k;
            }
        }
        System.out.println(sum);
        //优化代码:100是偶数，去掉=；奇书通过+=2可以去掉判断
        sum = 0;
        for (int k = 1; k < 100; k += 2){
            sum += k;
        }

        //循环嵌套
        /*
            1，所有合法的控制语句都可以嵌套使用
            2，循环嵌套，里层的循环可以当作外层循环的java语句即可
         */
        //举例
        for (int l = 1; l <= 2; l++){
            System.out.println("l --- >" + l);  //执行2次
            for (int j = 0; j < 10; j++){
                System.out.println("j = " + j); //执行10次
            }
        }
        /*
        int j = 0;
        for (int l = 1; l <= 2; l++){
            System.out.println("l --- >" + l);  //执行2次
            for (int j = 0; j < 10; j++){
                System.out.println("j = " + j); //执行10次
            }
        }
         */
        //九九乘法表
        /*
        1 * 1 = 1
        1 * 2 = 2    2 * 2 = 4
        1 * 3 = 3    2 * 3 = 6    3 * 3 = 9
        1 * 4 = 4    2 * 4 = 8    3 * 4 = 12    4 * 4 = 16
        1 * 5 = 5    2 * 5 = 10    3 * 5 = 15    4 * 5 = 20    5 * 5 = 25
        1 * 6 = 6    2 * 6 = 12    3 * 6 = 18    4 * 6 = 24    5 * 6 = 30    6 * 6 = 36
        1 * 7 = 7    2 * 7 = 14    3 * 7 = 21    4 * 7 = 28    5 * 7 = 35    6 * 7 = 42    7 * 7 = 49
        1 * 8 = 8    2 * 8 = 16    3 * 8 = 24    4 * 8 = 32    5 * 8 = 40    6 * 8 = 48    7 * 8 = 56    8 * 8 = 64
        1 * 9 = 9    2 * 9 = 18    3 * 9 = 27    4 * 9 = 36    5 * 9 = 45    6 * 9 = 54    7 * 9 = 63    8 * 9 = 72    9 * 9 = 81
        特点：
            1，共九行
            2，第一行，1个式子；第二行，2个式子....第N行，n个式子
         */
        for(int q = 1;q <= 9;q++){
            for(int w = 1;w <= q;w++){
                System.out.print(w + " * " + q + " = " + (q * w) + "    ");
            }
            System.out.println();
        }
    }
}
