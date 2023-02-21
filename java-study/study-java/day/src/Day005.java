/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.21
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
import java.util.Scanner;
public class Day005 {
    public static void main(String[] args){
        //输出信息到控制台
        //创建一个键盘扫描对象
        Scanner sca = new  Scanner(System.in);
        String str = sca.next();
        System.out.println(str);
        /*
        控制语句；
           分类：
                选择语句：
                    if 语句
                    switch语句
                循环语句
                    for语句
                    while语句
                    do..while...语句
                转向语句
                    continue
                    break
                    return
         */
        /*
        选择语句/分支语句：
            注意：
                对于if语句而言，在任何情况下只能有1个分支的执行，不可能存在多个分支执行
                if语句中只要有1个分支执行后，整个if语句就执行结束了
                带有else的分支，则一定会有分支执行
                当分支中的java语句只有1条时，大括号可以省略，为了可读性，最好不要省略
            if 语句  (条件语句)
               语法结构；
                  1，if（布尔表达式）{
                        java语句；
                     }
                   原理：如果布尔表达式执行为true，则执行大括号里的java语句，否则不执行
                  2，if（布尔表达式）{     分支1
                        java语句；
                     }else{             分支2
                        java语句；
                     }
                    原理：如果布尔表达式执行为true，则执行分支1大括号里的java语句，不执行分支2；否则执行分支2的java语句
                  3，if（布尔表达式1）{             分支1
                        java语句；
                     }else if（布尔表达式2）{       分支2
                        java语句；
                     }else if（布尔表达式3）{       分支3
                        java语句；
                     }
                   原理：从上到下依次去判断if后面的布尔表达式，当结果为true，则执行对应的分支Java语句
                  4，if（布尔表达式1）{             分支1
                        java语句；
                     }else if（布尔表达式2）{       分支2
                        java语句；
                     }else if（布尔表达式3）{       分支3
                        java语句；
                     }else{
                        java语句；
                     }

         */
        System.out.println("################################");
        byte age = sca.nextByte();
        if(age <= 5 & age > 0){
            System.out.println("幼儿");
        }else if( age <= 10 & age >= 6 ) {
            System.out.println("少儿");
        }else if( age <= 18 & age >= 11 ) {
            System.out.println("少年");
        }else if( age <= 35 & age >= 19 ) {
            System.out.println("青年");
        }else if( age <= 55 & age >= 36 ) {
            System.out.println("中年");
        }else if( age <= 150 & age >= 56 ) {
            System.out.println("老年");
        }else{
            System.out.println("请输入正确的年龄！");
        }
        double grade = sca.nextDouble();
        if(grade <0 & grade > 100){
            System.out.println("请输入正确的成绩分数");
        }else if(grade < 60){
            System.out.println("成绩不及格");
        }else if(grade >= 60 && grade < 70){
            System.out.println("成绩及格");
        }else if(grade >= 70 && grade < 90){
            System.out.println("成绩良");
        }else if(grade >= 90 && grade <= 100){
            System.out.println("成绩优秀");
        }





    }
}
