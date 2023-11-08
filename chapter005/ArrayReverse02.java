// 翻转数组
public class ArrayReverse02 {
    public static void main(String[] args) {
        
        int[] arr = {11, 22, 33, 44, 55, 66};

        /*
        使用逆序赋值方式
        1. 先创建一个新的数组 arr2,大小 arr.length
        2. 逆序逼历 arr ,将 每个元秦拷贝到 arr2的元素中(顺序拷贝)
        3. 建议增加一个循环变量 j -> 0 -> 5
         */
        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }

        arr = arr2;
        System.out.println("====arr的元素情况====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
