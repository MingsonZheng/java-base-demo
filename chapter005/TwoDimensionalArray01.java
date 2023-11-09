// 二维数组
public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        
        /*
        请用二维数组输出如下图形
        0 0 0 0 0 0
        0 0 1 0 0 0
        0 2 0 3 0 0
        0 0 0 0 0 0
         */
        int[][] arr = {{0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0},
                        {0, 2, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0}};
        
        System.out.println("二维数组的元素个数=" + arr.length);

        System.out.println("第3个一维数组的第4个值=" + arr[2][3]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("======================");

        int arr2[][];// 声明二维数组
        arr2 = new int[2][3];// 再开空间
        arr2[1][1] = 8;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("======================");

        /*
        看一个需求 : 动态创建下面二维数组，并输出
        i = 0: 1
        i = 1: 2 2
        i = 2: 3 3 3
        一个有三个一维数组，每个一维数组的元素是不一样的
         */
        int[][] arr3 = new int[3][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i+1];

            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
