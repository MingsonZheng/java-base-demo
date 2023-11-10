// 可变参数
public class VarParameterDetail {
    public static void main(String[] args) {
        
        // 细节: 可变参数的实参可以为数组
        int[] arr = {1, 2, 3};
        T t1 = new T();
        t1.f1(arr);
    }
}

class T {
    
    public void f1(int... nums) {
        System.out.println("长度=" + nums.length);
    }

    // 细节: 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    public void f2(String str, double... nums) {

    }
}