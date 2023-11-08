// Break
// 练习
public class BreakExercise {
    public static void main(String[] args) {
        
        // 1-100以内的数求和，求出 当和 第一次大于20的当前数[for + break]
        //
        // 思路分析
        // 1. 循环 1-100，求和 sum
        // 2. 当 sum > 20 时，记录下当前数，然后break
        // 3. 在for循环外部，定义变量 n ，把当前i 赋给 n
        
        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("和>20时候 当前数i=" + i);
                n = i;
                break;
            }
        }
        
        System.out.println("当前数=" + n);
    }    
}
