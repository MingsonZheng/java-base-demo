// 分支
// 练习
public class IfExercise01 {
    public static void main(String[] args) {
        
        // 编写程序，声明2个double型变量并赋值。
        // 判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
        double d1 = 33.5;
        double d2 = 2.6;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两数之和=" + (d1 + d2));
        }

        // 定义两个变量int，判断二者的和，
        // 是否能被3又能被5整除，打印提示信息
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("和可以被3又能被5整除");
        } else {
            System.out.println("和不能被3又能被5整除");
        }

        // 判断一个年份是否是闰年，间年的条件是符合下面二者之一: 
        // (1)年份能被4整除，但不能被100整除;(2)能被400整除
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
