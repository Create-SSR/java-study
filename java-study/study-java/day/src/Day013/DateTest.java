package Day013;

/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.03.6
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class DateTest {
    public static void main(String[] args){
        Date test = new Date();
        test.printDate();
        Date test2 = new Date(2023,3,6);
        test2.printDate();

    }
}
class Date{
    //年
    private int year;
    //月
    private int month;
    //日
    private int day;
    //构造方法
    public Date(){
        //调用有参构造方法，进行方法复用
        this(1997,6,26);
    }
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    //
    public void printDate(){
         System.out.println("今天是"+year+"年"+month+"月"+day+"日");
    }
}
