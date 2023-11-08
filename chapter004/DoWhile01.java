// While

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        
        int i = 1;
        do {
            System.out.println("hello, world" + i);
            i++;
        }while(i <= 10);

        // 统计1---200之间能被5整除但不能被3整除的 个数
        // 化繁为简
        // (1) 使用do-while输出 1-200
        // (2) 过滤 能被5整除但不能被3整除的数 %
        // (3) 统计满足条件的个数 int count = 0;
        i = 1;
        int count = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("i=" + i);
                count++;
            }
            i++;
        }while(i <= 200);
        System.out.println("count=" + count);

        // 如果张三不还钱，则李四将一直使出五连鞭，直到张三说还钱为止
        // [System.out.println("李四问 :还钱吗 ? y/n”)] do...while
        // 化繁为简
        // (1) 不停的问还钱吗?
        // (2) 使用char answer 接收，定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("李四问 :还钱吗 ? y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        }while (answer != 'y');

        System.out.println("张三还钱了");
    }
}
