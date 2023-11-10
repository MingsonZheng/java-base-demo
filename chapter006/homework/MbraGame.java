// 作业
/*
 请编写一个猜拳的游戏
 有个人 Tom，设计他的成员变量，成员方法，可以电脑猜拳，电脑每次都会随机生成 0，1，2
 0表示 石头 1 表示剪刀 2 表示 布
 并要可以显示 Tom的输赢次数 (清单) ，假定 玩三次·
 */

import java.util.Random;
import java.util.Scanner;

public class MbraGame {
    public static void main(String[] args) {
        
        Tom t = new Tom();
        int isWinCount = 0;

        int[][] arr1 = new int[3][3];
        int j = 0;

        String[] arr2 = new String[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("你输入你要出的拳 （0-拳头，1-剪刀，2-布）：");
            int num = scanner.nextInt();
            t.setTomGuessNum(num);
            int tomGuess = t.getTomGuessNum();
            arr1[i][j+1] = tomGuess;

            int comGuess = t.computerNum();
            arr1[i][j+2] = comGuess;

            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            System.out.println("==================================================");
            System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + isWin);
            System.out.println("==================================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
            t.count++;
        }

        System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
        for (int a = 0; a < arr1.length; a++) {
            System.out.print(arr1[a][0] + "\t");
            for (int b = 1; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t");
            }

            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + isWinCount + "次");
    }
}

class Tom {

    int tomGuessNum; // 0, 1, 2
    int comGuessNum;
    int winCountNum;
    int count = 1;

    public int computerNum() {
        Random r = new Random();
        comGuessNum = r.nextInt(3);// 返回 0-2的随机数
        return comGuessNum;
    }

    public void setTomGuessNum(int tomGuessNum) {
        if (tomGuessNum > 2 || tomGuessNum < 0) {
            throw new IllegalArgumentException("数字输入错误");
        }
        this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum() {
        return tomGuessNum;
    }

    public String vsComputer() {
        if (tomGuessNum == 0 && comGuessNum == 1) {
            return "你赢了";
        } else if (tomGuessNum == 1 && comGuessNum == 2) {
            return "你赢了";
        } else if (tomGuessNum == 2 && comGuessNum == 0) {
            return "你赢了";
        } else if (tomGuessNum == comGuessNum) {
            return "平手";
        } else {
            return "你输了";
        }
    }

    public int winCount(String isWin) {
        if ("你赢了".equals(isWin)) {
            winCountNum++;
        }

        return winCountNum;
    }
}