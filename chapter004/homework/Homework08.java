public class Homework08 {
    public static void main(String[] args) {
        
        /*
        求出1-1/2+1/3-1/4.....1/100的和
        
        思路分析
        1. 1-1/2+1/3-1/4.....1/1 = (1/1)-(1/2)+(1/3)-(1/4)...1/100
        2. 从上面的分析我们可以看到
        (1) 一共有100数 ， 分子为1 ，分母从1-100
        (2) 还发现 当分母为奇数时，前面是 +，当分母是偶数时，前面是-
        3. 我们可以使用 for + 判断即可完成
        4. 把结果存放到 double sum
        5. 这里有一个隐藏的陷阱，要把 公式分子 1 写出1.0 能得到精确的小数
         */

        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        
        System.out.println("sum=" + sum);
    }
}
