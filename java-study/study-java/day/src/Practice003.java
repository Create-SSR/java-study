/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.26
 * DATA 为文档创建日期，TIME 为详细创建时间
 */

import java.util.Scanner;

public class Practice003 {
    public static void main(String[] args) {
        /*
            题目1：给你一个整数 n，请你返回 n! 结果。
            例如，如果 n = 3，那么你应该返回 24。
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        /*
        调用计算阶乘的方法
         */
        int result2 = jieCheng(5);
        System.out.println(result2);

        //调用判断一个正整数n的最小质数方法
        isMinZhiShu(5);

        /*
            题目2：输出大于某个正整数n的最小质数
         */

    }

    public static int jieCheng(int n) {
        /*
            使用方法实现阶乘
         */
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    /*
    题目3：输出大于某个正整数n的最小质数
     */
    //定义判断一个数是否是质数的方法
    public static boolean isZhiShu(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    //定义大于某个正整数n的最小质数的方法
    public static void isMinZhiShu(int n){
        while(true){
            n++;
            if(isZhiShu(n)){
                System.out.println(n);
                break;
            }
        }
        /*优化代码*/
        while(!isZhiShu(++n)){
        }
        System.out.println(n);


    }
}
