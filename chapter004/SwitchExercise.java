// Switch

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        
        // 使用 switch 把小写类型的 char 型转为大写(键盘输入)。
        // 只转换 a,b,c,d,e.其它的输出“other"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-e");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
                break;
        }
        
        // 对学生成绩大于60分的，输出”合格”。低于60分的，输出”不合格”。
        // (注: 输入的成绩不能大于100)
        // 提示 成绩/60
        double score = 88.5;
        if (score >= 0 && score <= 100) {
            switch ((int)(score / 60)) {
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;            
            }
        } else {
            System.out.println("输入的成绩在0~100");
        }
        
        // 根据用于指定月份打印该月份所属的季节。
        // 3,4,5 春季 6,7.8 夏季 9,10,11秋季 12,1,2 冬季
        // [提示 使用穿透]
        System.out.println("输入月份");
        int month = myScanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;        
            default:
                System.out.println("你输入的月份不对(1-12)");
        }
    }
}