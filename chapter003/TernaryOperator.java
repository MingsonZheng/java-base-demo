// 三元运算符
public class TernaryOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 99;
        // 解读
        // 1. a > b 为 false
        // 2. 返回 b--，先返回 b 的值，然后再 b-1
        // 3. 返回的结果是 99
        int result = a > b ? a++ : b--;
        System.out.println("result=" + result);// 99
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // 表达式1和表达式2要为可以赋给接收变量的类型
        // （或可以自动转换/或者强制转换）
        int c = a > b ? (int)1.1 : (int)3.4;
        double d = a > b ? a : b + 3;// 满足 int -> double

        // 实现三个数的最大值
        int n1 = 533;
        int n2 = 33;
        int n3 = 123;
        // 思路
        // 1. 先得到 n1 和 n2 中最大数，保存到 max1
        // 2. 然后再求出 max1 和 n3 中的最大数，保存到 max2
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数=" + max2);
        // 使用一条语句实现，推荐使用上面的方法
        // 后面可以使用更好的方法，比如排序
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println("最大数=" + max);
    }
}
