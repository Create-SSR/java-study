package Day013;

/**
 * @author USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class StzticTest {
     public static void main(String[] args) {
         //创建对象
         Chinese c1 = new Chinese();


     }
}
//定义一个类:中国ren
class Chinese{
    //身份证号
    String idCard;
    //姓名
    String name;
    //国籍 对于中国人这饿个类来说，国籍一直是中国；
    // 使用静态变量
    static String country = "中国";

    //g构造方法
    public Chinese(){
    }
    public Chinese(String s1,String s2,String s3){
        idCard = s1;
        name = s2;
        country = s3;
    }

}
