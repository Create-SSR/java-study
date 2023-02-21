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


        /*
        Linux命令：
    del             删除一个或者多个文件    del *.class  删除所有class后缀的文件
    ifconfig        查看IP地址    参数：/all  详细信息
                        物理地址唯一，也叫MAC地址
    ping            用法：ping ip地址  /  ping 域名     用于查看是否可以正常通信

文本编辑快捷键：
    control + c / v / x / s / z / y / 复制/粘贴/剪切/保存/撤销/重做
    回到行首   command + 方向键
    选中整行   command + shift + 方向键   / 鼠标连击3次
    全选      command + a

java语言特性：

    1，简单性
        1.1
           在Java中真正操作内存的是：JVM （Java虚拟机）
           所有Java程序都是运行在JVM中，JVM再去操作内存
           Java屏蔽了指针概念，程序员不能直接操作指针，或者说不能直接操作内存
            优点：不容易导致内存泄露
            缺点：效率问题，驾驭感较差
        1.2
            内存：于计算机而言：最主要的部件：
                CPU：中央处理器，负责运算
                内存：程序运行过程中临时数据存储空间
                硬盘：持久化设备，不会因断电等原因丢失数据
                主板：载体，将以上的部件连接起来

    2，面向对象
        Java是完全面向对象的。

    3，健壮性
        Java中有一种机制：（GC机制）  自动垃圾回收机制
        JVM负责调动GC机制，程序员不需要干涉

    4，多行程
        Java完全支持多线程并发

    5，可移植性/跨平台
        Java程序编写一次，可以到处运行，且兼容Windows、Linux、Macos 上
        JVM虚拟机，用C++ 实现的虚拟的计算机，

JDK、JRE、JVM三者关系： JDK包含JRE，JRE包括JVM
    JDK：Java开发工具箱   可以独立安装
    JRE：Java运行环境    可以独立安装
    JVM：Java虚拟机   不能独立安装

术语总结：
    JavaSE：标准版
    JavaEE：企业版
    JavaME：微型板

Java加载与执行理解
    Java程序从编写到运行
    编译阶段： 编写.java结尾的源文件    编译器（javac）进行编译
             生成.class结尾的字节码

    运行阶段； 类加载器-装载
             JVM-解释器进行解释
             OS-操作
             硬件平台

    注意：Java程序员直接编写的java代码无法直接被JVM识别，必须进行编译生成字节码，JVM识别字节码
        删除源代码，字节码也可以执行
        1个java源文件可以编译生成多个class文件
        字节码文件不是二进制文件，操作系统可以直接操作二进制文件

         */


    }

}
