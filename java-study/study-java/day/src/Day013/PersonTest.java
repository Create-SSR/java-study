package Day013;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class PersonTest {
    public static void main(String[] args){
        //创建person对象
        Person person = new Person();
        //访问人的年龄、姓名、性别
        System.out.println(person.age);
        //修改数据
        person.age = 26;
        System.out.println(person.age);

        String n1 = person.getName();
        person.setName("xiaoming");




    }
}
