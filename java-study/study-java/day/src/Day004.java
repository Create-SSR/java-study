/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.20
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
/*
        类型转换规则：
            1，八种基本数据类型中，只有boolean类型不能转换，其他都可以；
            2，当整数的字面量没有超出byte、short、char的取值范围时，可以直接将其赋值给byte、short、char的变量
            3，小容量向大容量转换称为自动类型转换，容量从大到小排序为：
                byte<short(char)<int<long<float<double
            4,大容量向小容量转换时，需要加强制转换符，称为强制类型转换；运算时可能会出现精度损失
            5，char short、byte做运算的时候，是各自转换成int,再进行运算；
            6，多种数据类型混合运算时，各自先转换成容量最大的那种再进行运算

         */

public class Day004 {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        /*
        计算机在任何情况下都只能识别二进制；
        计算机在底层存储数据的时候，一律采用二进制的补码形式 ；（补码形式效率最高
        二进制有原码、反码、补码
        对一个正数来说，二进制的原码、反码、补码完全相同
        对于一个负数来说，三码关系：
        byte a = -1
        原码：10000001
        反码：11111110   符号位不变，其余为取反
        补码：11111111   反码+1


        char 取值范围：65535
        当一个整数没有超出byte、short、char的取值范围时，这个整数可以直接赋值给byte、short、char变量
         */
        //97是int类型，可以自动转换成char类型
        char c = 97;
        System.out.println(c);
        //强制转换
        char d = (char) 65536;
        System.out.println(d);
        /*
        例如：int 150
        二进制：00000000 00000000 00000000 10010110
        强制转换成byte，10010110
        二进制补码： 10010110
        反码：10010101
        原码：11101010------> -106
        */
        byte e = (byte) 150;
        System.out.println(e);
        /*
        char short、byte做运算的时候，是各自转换成int,再进行运算；
         */
        char f = 'a';
        byte g = 1;
        //java编译器不知道运算结果
        //short i = f + g;
        short i = (short) (f + g);
        System.out.println(f + g);
        //java中规定，int类型和int类型运算，结果还是int类型
        //java中运算结果不一定是精确的
        int j = 10/3;
        System.out.println(j);

        /*
        浮点型
        float 4个字节  单精度
        double 8个字节 双精度 更精确
        java中还有提供了精度更高的类型，这种类型专门用在财务软件方面：java.math.BigDecimal(引用数据类型)
        float和double存储数据的时候都是存储的近似值
        因为存在无限循环小数，用有限的存储资源，只能存储近似值

        long是8个字节
        float是4个字节，float容量 >  long容量
        但是：在java中，任意一个浮点型都比整数型空间大；

        java中，任何一个浮点型都被当作double类型处理，如果是float类型，需要在字面量后面添加F/f

         */
        //大容量转化成小容量需要强转
        //int n = 10.0/5;
        int n = (int) 10.0/5;
        System.out.println(n);
        int m = (int) (10.0/5);
        System.out.println(m);
        // boolean 只有两个值，true 和 false
        // 通常用于条件判断，通常放在条件位置上
        boolean sex = true;
        if (sex){
            System.out.println("男");
        }else{
            System.out.println("女");
        }

    }
}
