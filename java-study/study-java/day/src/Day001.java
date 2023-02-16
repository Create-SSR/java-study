/**
 * @author $Create
 * USER 表示主机名
 * {@code @date} $2023.02.16
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
/*
        1，在java中任何有效的代码必须在类体中，最外层必须是一个类的定义
        2，public表示公开的，class表示定义一个类，Day001代表一个类名，类名后必须是一对大括号，称为类体
        3，大括号必须是成对的，并且建议成对编写保证不会丢失
        4，注意缩进
*/

//声明/定义一个类，类名命名规范：首字母大写，多个字母组成时首字母都大写，驼峰样式
public class Day001 {     //类体
    //整个代码被称为main方法，即主方法（程序的入口）
    //对于主方法，只有args 可以改，其他地方不能动
    public static void main(String[] args) {      //方法体
        // 由一行一行的的java语句构成，并且每一句Java语句都需要以英文"；"结尾
        // 方法体中的代码由上而下的顺序依次执行

        //System.out.println("Hello world!")作用就是向控制台输出一句话
        System.out.println("Hello world!");

        //注释:三种写法
        //1,单行注释
        /*
        2,多行注释
         */
        /*   3,javadoc注释
        *类的注释信息   可以有javadoc识别
        *@version 1.0
        * @author <a href="mailto:
        *
         */

        //数字可以不加双引号
        System.out.println(100);
        //加双引号后是字符串
        System.out.println("100");
        //对于数字而言，+ - * / % 都可以不加双引号使用
        System.out.println(10+2-3*3/4);

        //1，一个java源文件中可以定义多个class
        //2，public的类不是必须的
        //3，源文件汇总只要有一个class的定义，就会生成一个class文件
        //4，public定义的类可以没有，但如果有，public修饰的类名必须和源文件名称一致
        //5，一个源文件中public的类只能有一个





    }

}
