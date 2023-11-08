// 多重循环
public class Stars {
    public static void main(String[] args) {
        
        // 经典的打印金字塔
        // 使用 for 循环完成下面的案例
        // 请编写一个程序，可以接收一个整数,表示层数(totalLevel)打印出金字塔
        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********

        // 思路分析
        // 化繁为简
        // 1. 先打印一个矩形
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }

        // 2. 打印半个金字塔
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 3. 打印整个金字塔
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        for (int i = 1; i <= 5; i++) {
            // 在输出*之前，还有输出 对应空格 = 总层数-当前层
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 4. 打印空心的金字塔
        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********
        for (int i = 1; i <= 5; i++) {
            // 在输出*之前，还有输出 对应空格 = 总层数-当前层
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 当前行的第一个位置是*,最后一个位置也是*，最后一层全部*
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // 先死后活
        // 5 层数做成变量 int totalLevel = 5;
        int totalLevel = 5;
        for (int i = 1; i <= totalLevel; i++) {
            // 在输出*之前，还有输出 对应空格 = 总层数-当前层
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 当前行的第一个位置是*,最后一个位置也是*，最后一层全部*
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
