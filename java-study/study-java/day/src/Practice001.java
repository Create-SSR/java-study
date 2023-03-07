/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.23
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Practice001 {
    public static void main(String[] args) {
        //题目1：计算1000内所有不能被7整除的数只和
        /*
            解题思路：
                第一步，遍历1-1000的数字
                第二步：筛查不能被7整除的整数
                第三步：计算出总和
         */
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {//第一步
            if (i % 7 != 0) {//第二步
                sum += i;//第三步
            }
        }
        System.out.println(sum);
        //题目2：计算1+2-3+4-5=6-7+....+100
        /*
            解题思路：奇书时减法，偶数时加法
                思路1：求出所有奇数求和，求出所有偶数求和，然后偶数之和减去奇数之和
                思路2：遍历所有数字，判断是偶数还是奇数，偶数做加法，奇数做减法
         */
        //思路2
        sum = 1;
        for (int q = 2; q <= 100; q++) {
            if (q % 2 == 0) {
                sum += q;
            } else {
                sum -= q;
            }
        }
        System.out.println(sum);
        //思路1
        sum = 0;
        int sum1 = 0;
        for (int w = 0; w <= 100; w++) {
            if (w % 2 == 0) {
                sum1 += w;
            } else if (w % 2 != 0) {
                sum += w;
            }
        }
        System.out.println(sum1 - sum);
        //题目3：计算阶乘
        /*
            解题思路：
                第一步：遍历1-n的数字
                第二步：计算阶乘
                第三步：输出阶乘
         */

        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        sum = 1;//乘法的初始值不能为0
        for (int e = 1; e <= n; e++) {
            sum *= e; //sum = sum * e
        }
        System.out.println(sum);
        //题目4：判断是否是质数
        /*
            解题思路：质数：大于1的自然数，除了1和它本身以外不再有其他因数的自然数
               第一步：遍历所有数字
               第二步：判断是否是质数
         */
        int f = s.nextInt();

        //在外部打布尔标记
        boolean h = true;
        for (int j = 2; j < f; j++) {
            if (f % j == 0) {
                h = false;
                break;
            }
        }
        System.out.println(h ? f + "是质数" : f + "不是质数");
        //题目5：输出星星图表
        /*
            解题思路：
                n行循环n次
                规律：空格 （n-第几行）个
                    星星  （2n-1）个
         */
        int l = s.nextInt();
        for (int p = 1; p <= l; p++) {
            for (int o = 0; o <= l - p; o++) {
                System.out.print(" ");
            }
            for (int u = 0; u < 2 * p - 1; u++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
