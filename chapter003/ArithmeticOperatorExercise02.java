// 算术运算符课堂练习02
// 1. 假如还有59天放假，问: 合xx个星期零xx天
// 2. 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为: 5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。[234.5]
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        
        // 1. 思路分析
        // (1) 使用 int 变量 days 保存天数
        // (2) 一个星期是 7 天，星期数 weeks : days / 7 零xx天 days % 7
        // (3) 输出
        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "天 合" + weeks + "星期零" + leftDays + "天");

        // 2. 思路分析
        // (1) 先定义一个 double 变量 huaShi 保存华氏温度
        // (2) 根据给出的公式，进行计算即可 5/9*(华氏温度-100)
        // (3) 将得到的结果保存到 double 变量 sheShi
        double huaShi = 234.6;
        //考虑数学公式和 java 语言的特性，5 / 9 = 0
        // double sheShi = 5 / 9 * (huaShi - 100);
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
    }
}
