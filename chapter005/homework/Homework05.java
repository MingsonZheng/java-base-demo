// 作业
public class Homework05 {
    public static void main(String[] args) {
        
        /*
        随机生成10个整数(1 1的范围)保存到数组，
        并倒序打印以及求平均值、求最大值和最大值的下标.
        并查找里面是否有 8 
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        System.out.println("====arr的元素情况====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\n====arr的元素情况(倒序)====");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }

        double sum = 0;
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {

            sum += arr[i];

            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("\nmax=" + max + " maxIndex=" + maxIndex);
        System.out.println("平均值=" + (sum / arr.length));

        int findNum = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                System.out.println("找到数" + findNum + "下标=" + i);
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("没有找到数" + findNum);
        }
    }
}
