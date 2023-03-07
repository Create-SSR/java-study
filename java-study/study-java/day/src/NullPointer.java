/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class NullPointer {
    A a;
    public static void main(String[] args)  {
        NullPointer n = new NullPointer();
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        //不写以下代码会出现空指针异常
        //java中垃圾回收机制CG只要针对的是堆内存中的垃圾数据：没有任何引用指向该对象的时候，被判定为垃圾数据
        c.d = d;
        b.c = c;
        a.b = b;
        n.a = a;
        System.out.println(n.a.b.c.d.i);
    }

}
class A {
    B b;
}
class B {
    C c;
}
class C {
    D d;
}
class D {
    D i;
}
