/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.23
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day008 {
    public static void main(String[] args){
        /*
        while循环：
        语法机制：
            while (条件表达式) {
                代码块
            }
            执行原理：
                判断布尔表达式的结果，如果为true就执行循环体，当为false则跳出循环
             和for原理上是一致的，形式上不一致
                for（初始化表达式；条件表达式；更新表达式）{
                    循环体（java语句）；
                }

                 初始化表达式；
                 while（布尔表达式）{
                    循环体；
                    更新表达式；
                 }
         */
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        /*
        do...while循环语句
            语法机制：
                do {
                    循环体代码块
                } while (布尔表达式)；
                注意：while ( )后面必须加上 封号；
                执行原理： 先执行循环体，再判断布尔表达式，如果为true，则继续执行；如果是false则结束
         */
        int y = 0;
        do {
            System.out.println(y);
            y++;
        }while(y <= 10);

        /*
            转向语句
                break
                    作用在两个位置
                       1，switch语句中，用来终止switch的执行
                       2，用在循环语句中，终止循环的执行
                       break终止指定的循环；需要先给循环起的名字，在break后面加上名字；即可

                continue
                    对比break
                    作用：终止当前本次循环，直接进入下一次循环继续执行
                    ontinue可以指定循环继续执行；需要先给循环起的名字，在break后面加上名字；即可
         */
        for(int r = 0; r < 100; r++) {//外层
            for (int t =0;t < 10;t++){//里层
                if (t == 5){   //break语句只会让离他最近的循环终止结束；
                    break;     //break终止的不是if，而是针对离他最近的循环
                }
                System.out.println(t);   //输出：0，1，2，3，4
            }
            System.out.println("------------------");//break不会终止这一层的循环
        }
        System.out.println("Hello World!");//break不会让整个方法终止掉，只是终止最近的循环

        //break终止指定的循环；需要先给循环起的名字，在break后面加上名字；即可
        a:for(int f = 0; f < 100; f++) {//外层
            b:for (int h =0;h < 10;h++){//里层
                if (h == 5){   //continue会 跳过本次循环,直接继续下一次循环；
                    continue a;     //continue，可以接指定循环
                }
                System.out.println(h);   //输出：0，1，2，3，4
            }
            System.out.println("------------------");//break不会终止这一层的循环
        }
        System.out.println("Hello World!");//break不会让整个方法终止掉，只是终止最近的循环


    }
}
