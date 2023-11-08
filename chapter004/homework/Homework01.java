public class Homework01 {
    public static void main(String[] args) {
        
        /*
        某人有100,000元,每经过一次路口，需要交费,规则如下
        1) 当现金>50000时,每次交5%
        2) 当现金<=50000时,每次交1000
        编程计算该人可以经过多少次路口，要求: 使用 while + break方式完成

        思路分析
        1.定义 double money 保存 100000
        2 .根据题的要求，我们分析出来有三种情况
        money > 50000
        money >=1000 && money <= 50000
         */

         double money = 100000;
         int count = 0;
         while (true) {
            if (money > 50000) {
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
            System.out.println("100000可以过" + count + "路口..");
         }
    }
}
