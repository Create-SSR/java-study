/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.18
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Day003 {
    public static void main(String[] args) {
        /*数据类型
            作用：数据类型用来声明变量，程序在运行时根据数据类型来分配不同大小的内存
            分类：
                一，基本数据类型
                    基本数据类型包括：
                        整型、浮点型、字符型、布尔型、
                        分为四大类八小种：
                            1，整数型   byte、short、int、long
                            2，浮点型   float、double
                            3，布尔型   boolean
                            4，字符型   char
                        区别：占用空间大小不同
                        类型           占用字节数量（byte）       取值范围
                        --------------------------------------------------------
                        byte             1                  -128 - 127
                        short            2                  -32768 - 32767   65536个数字
                        int              4                  -2147483648 - 2147483647
                        long             8
                        float            4
                        double           8
                        boolean          1                  1为true  0为false
                        char             2                  0 - 65536

                   byte的取值范围计算方法：
                   在计算机中，一个二进制位最左边的是符号位，当为0时表示正数，当为1时表示负数；
                   所以 byte最大为8bit，二进制最大为  01111111 转化为十进制为：127（2^7 - 1）；最小为：11111111  转化为十进制为：-128
                   short 和 char 实际上容量相同，不过char可以表示更大的数字；因为char表示的是文字，没有正负之分
         计算机存储单位：1字节 = 8 bit
                      1bit 就是一个1或0
                      1KB = 1024byte
                      1MB = 1024KB
                      1GB = 1024MB
                      1TB = 1024GB

                      byte b = 2;    在计算机中表示：00000010
                      short s = 2;    在计算机中表示：00000000 00000010
                      int i = 2;    在计算机中表示：00000000 00000000 00000000 00000010


             进制转换
                二进制转十进制：
                    2^2     2^1     2^0
                    1       1       1
                    4   +   2   +   1   =  7
                十进制转二进制
                    除以2 然后余数逆序输出

                二，引用数据类型
                    java中出了基本数据类型，其他都属于引用数据类型
                    字符串型string属于引用数据类型
         */

        //char 表示的是文字
        /*字符编码：人为定义的一套转换表
            字符编码和解码必须采用同一套字符编码方式
            ASCII码采用 1byte进行存储，因为英文有26个，
                'a' ---> 97  --->  01100001
                'b' ---> 98
                'A' ---> 65
                '0' ---> 48
                '1' ---> 49

            中文的编码方式：GB2312 <  GBK <GB18030

            unicode编码统一了全球所有的文字，包括UTF-8、UTF-16.........
            unicode 是十六进制的

         */
        /*
        字符型 char
           char可以表示一个汉字，占用2个字节
         */
        char c1 = '中';
        System.out.println(c1);
        char c2 = 'A';
        System.out.println(c2);
        char c3 = 'a';
        System.out.println(c3);
        char c4 = '0';
        System.out.println(c4);

        //java 中的转义字符
        //  \t 实际上是一个字符，两个字符合在一起表示一个字符，表示制表符 tab
        //  java语言中 \ 负责转义；
        char c5 = '\t';
        //System.out.print(c5); 不换行
        //System.out.println("Hello\tWorld!"); 换行
        System.out.print(c5);
        System.out.println("Hello\tWorld!");

        // 输出 ' 引号  \' 联合起来表示一个'
        System.out.println('\'');
        //  java中\\ 两个反斜杠 代表一个 \ 字符
        System.out.println("\\");
        // java中 \" 表示双引号
        System.out.println("\"Hello world\"");
        //  java中 \ 代表一个空格
        System.out.println("\t");
        //  java中 \n 代表一个换行符
        System.out.println("\n");
        //  java中 \r 代表一个回车符
        System.out.println("\r");
        //  java中 \f 代表一个换页符
        System.out.println("\f");
        //  java中 \\ 代表一个反斜杠
        System.out.println("\\\\");
        // 双引号里可以有一个单引号
        System.out.println("'");

        // 反斜杠u 后面表示的是一个字符的unicode编码
        System.out.println("\u0041");
        System.out.println("\u0042");

        // 整数型在java中共有四种类型
        /*
        byte 1个字节    最大值：127
        short 2个字节   最大值：32767
        int 4个字节     最大值：2147483647
        long 8个字节
        1个字节 = 8 bit
        1 byte = 8 bit

         */
        //十进制
        int a = 10;
        //八进制
        int b = 010;
        //十六进制
        int c = 0x10;
        //二进制
        int d = 0b10;
        System.out.println(a);

        /*
        在Java中非常重要的结论：
            任何情况下，整数型的字面量 默认当作int类型处理
            如果希望该整数型字面量被当作long类型处理，需要在字面量后面加 L/l    建议使用大写L
            如果希望该整数型字面量被当作double类型处理，需要在字面量后面加 D
            如果希望该整数型字面量被当作float类型处理，需要在字面量后面加 f

            e变量是long类型，占8个字符；int类型占4个字符；
         */
        //小容量可以自动转换成大容量这种操作被称为：自动类型转换
        long e = 100;
        System.out.println(e);
        //不存在类型转换
        long f = 300L;
        System.out.println(f);
        //题目：自动类型转换
        long h = 2147483647;
        System.out.println(h);

        /*
        强制类型转换
        在java语言中，大容量转换成小容量，必须加强制类型转换符，进行强转；
        注意：强制转换后欧，可能会损失精度

        底层原理：
        long 100L：00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000010
        int 100: 00000010
         */
        long i = 100L;
        //强制类型转换符
        int j = (int) i;
        System.out.println(j);
        //int 300 对应二进制码：00000000 00000000 00000001 00101100
        //byte占1个字节，强转之后，二进制码是 00101100   转为十进制是44
        //语法机制： 当整数型字面量没有超出byte的取值范围时，那这个整数型字面量可以直接赋值给byte类型的变量；
        //         当整数型字面量没有超出short的取值范围时，那这个整数型字面量可以直接赋值给short类型的变量；
        byte k = (byte) 300;
        System.out.println(k);
        short l = 2;
        byte m = 1;
        System.out.println(l);
        /*
        运算符：
        算术运算符（operator）：+ - * / % ++ --
         */
        int q = 10;
        int w = 3;
        //++符语法规则：
        //当++出现在变量前的时候，先进行自加1的运算，再赋值；
        //当++出现在变量后的时候，先赋值，再进行自加1的运算；
        int z = 90;
        System.out.println(z++);
        System.out.println(z);
        int x = 80;
        System.out.println(++x);
        System.out.println(x);
        int v = 60;
        System.out.println(v--);
        System.out.println(--v);
        System.out.println(v);
        /*
        关系运算符：
        ** 规则：所有的关系运算符的运算结果都是布尔类型
        在java中，= 是赋值运算符；==是关系运算符，判断是否相等
         */
        System.out.println(x == z);
        System.out.println(x > v);
        System.out.println(x >= v);
        System.out.println(x < v);
        System.out.println(x <= v);
        System.out.println(x != v);
        /*
        逻辑运算符：
        &   逻辑与  并且   两边都为true才为true
        ｜   逻辑或  或者  两边有一边为true即为true
        !   逻辑非  取反
        &&  短路与
        ｜｜  短路或
        规则：
            逻辑运算符两边要求都是布尔类型，并且最终的运算结果都是布尔类型
         */
        // 短路现象：当左边的表达式为false时，右边的表达式不再执行
        // && 比 & 效率跟高一些
        //当既需要左边表达式执行，又需要右边表达式执行时，用 &

        int x1 = 10;
        int x2 = 11;
        System.out.println(x1 > x2 & x1 > x2++);
        System.out.println(x2); // x2 = 12

        /*
        赋值运算符
            基本赋值运算符：=
            扩张赋值运算符 +=  -=  *=  %=  /+
               注意扩展赋值运算符两个符号之间不能有空格

            赋值运算符右边的 = 优先级比较高，先执行右边的表达式
            然后将表达式执行结果放在左边的盒子中（赋值）
         */
        int x3 = 10;
        x3 += 20;
        System.out.println(x3); // x3 = 30
        //思考： i += 10   和 i = i + 10
        /*
        条件运算符：（三目运算符）
           语法格式： 布尔表达式 ？ 表达式1 ： 表达式2
           执行原理： 布尔表达式的结果为true ，则整个表达式的结果为 表达式1的执行结果
                    布尔表达式的结果为false ，则整个表达式的结果为 表达式2的执行结果
         */
        //sex ? '男' : '女';不是表达式
        boolean sex = true;
        //char c5 = sex ? '男' : '女';
        System.out.println(c5);
        /*
        字符串连接符： +
            1， + 运算符在java中两个作用：
                1，求和       当+ 号两边是数字类型的时候
                2，字符串拼接  当+ 号任意一边是字符串类型的时候
                注意：字符串拼接完成后的结果还是一个字符串
         */
        //口诀：加一个双引号，双引号里加两个加号，两个加号之间加变量名
        String name = "king";
        System.out.println("欢迎回来" + name);
        //int i = 100;
        i = i++;
        System.out.println(i);


















    }
}
