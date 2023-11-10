// 作业
public class Homework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {1.0, 4.7, 1.8};
        System.out.println("arr的最大值=" + a01.max(arr));

        double[] arr2 = {};
        System.out.println("arr2的最大值=" + a01.max(arr2));

        double[] arr3 = null;
        Double res = a01.max(arr3);
        if (res != null) {
            System.out.println("arr3的最大值=" + a01.max(arr3));    
        } else {
            System.out.println("arr3的输入有误，数组不能为 null，或者{}");
        }
        
    }
}

/*
 编写类A01，定义方法max，实现求某个double数组的最大值，并返回

 思路分析
 1. 类名 A01
 2. 方法名 max
 3. 形参 (double[])
 4· 返回值 double
 */
class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            return max;
        } else {
            return null;
        }
    }
}