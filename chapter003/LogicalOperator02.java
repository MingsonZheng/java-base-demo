// 逻辑运算符
public class LogicalOperator02 {
    public static void main(String[] args) {

        // || 短路与 和 | 逻辑或
        int age = 50;
        if (age > 20 || age < 90) {
            System.out.println("ok100");
        }

        // | 逻辑或使用
        if (age > 20 | age < 90) {
            System.out.println("ok200");
        }

        // 区别
        int a = 4;
        int b = 9;
        // 对于 || 短路或而言，如果第一个条件为 true，后面的条件不再判断
        // 对于 | 逻辑或而言，如果第一个条件为 true，后面的条件仍会判断
        if (a > 1 | ++b > 4) {
            System.out.println("ok300");
        }
        System.out.println("a=" + a + "b=" + b);// 4 10        
    }
}
