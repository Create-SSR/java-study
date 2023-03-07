/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day006 {
    public static void main(String[] args){
        /*
        switch 语句
            语法格式：
            switch (值) {
            case 值1:
                java语句；
                break；
            case 值2:
                java语句；
                break；
            default:
                java语句；
            }

            注意：
                1，break不是必须的，default分支也不是必须的
                2，注意JDK版本：JDK8之前不支持string类型，支持int类型；
                    JDK8版本之后，开始支持string类型
                3，switch理论上只支持int和string，但byte、short、char也可以，使用在switch中，因为可以进行自动类型转换
            执行原理：
                switch后面的值会与case后面的值1、值2进行 == 比较，如果相同，执行该分支的java语句，遇到break语句，switch语句执行结束
                当所有case都没有匹配上，执行default分支
                注意：如果分支执行了，但是没有break，此时会发生case穿透现象
         */
        //long l = 100L;
        byte b = 100;
        switch (b){
        }
        short s = 100;
        switch (s){
        }
        char c = 'a';
        switch (c){
        }
        String s1 = "daknas";
        switch (s1){
        }
        java.util.Scanner sca = new java.util.Scanner(System.in);
        int num = sca.nextInt();
        switch(num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                //穿透现象  输入2 会输出星期二和星期三
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("星期日");
        }


        System.out.print("请输入0或者1，1表示男，0表示女；");
        int gender = sca.nextInt();
        System.out.print("请输入0或者1，1表示雨天，0表示晴天；");
        int weather = sca.nextInt();
        if(gender == 0 && weather == 0){
            System.out.println("今天是晴天，记得涂防嗮霜");
        }else if(gender == 1 && weather == 0){
            System.out.println("今天下雨，别出去六");
        }else if(gender == 0 && weather == 1){
            System.out.println("今天是雨天，记得打伞");
        }else if(gender == 1 && weather == 1){
            System.out.println("今天下雨，别出去六");
        }
        //case合并
        System.out.print("请输入您的成绩");
        float score = sca.nextFloat();
        int grade = (int) (score/10);
        switch (grade){
            case 10: case 9:
                System.out.println("成绩优秀");
                break;

            case 8: case 7:
                System.out.println("成绩良好");
                break;

            case 6:
                System.out.println("成绩及格");
                break;

            default:
                System.out.println("成绩不及格");

        }


    }
}
