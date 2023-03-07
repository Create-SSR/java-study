/**
 * @author create
 * USER 表示主机名
 * {@code @date} $2023.02.15
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class Practice002 {
    public static void main(String[] args) {
        //题目6：小明妈妈每天给小明5元，会存起来，当这一天是5的倍数时，他会花出去6元，问：多少天可以存够100
        /*
            解题思路：

         */
        double sum = 0;

        int n = 1;
        for (; sum <= 100.0; n++) {
            if (n % 5 != 0) {
                sum += 2.5;
            } else if (n % 5 == 0) {
                sum -= 6.0;
            }

        }
        System.out.println(n + 1);

    }
}
