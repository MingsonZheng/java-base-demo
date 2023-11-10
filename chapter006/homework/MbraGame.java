// ��ҵ
/*
 ���дһ����ȭ����Ϸ
 �и��� Tom��������ĳ�Ա��������Ա���������Ե��Բ�ȭ������ÿ�ζ���������� 0��1��2
 0��ʾ ʯͷ 1 ��ʾ���� 2 ��ʾ ��
 ��Ҫ������ʾ Tom����Ӯ���� (�嵥) ���ٶ� �����Ρ�
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
            System.out.println("��������Ҫ����ȭ ��0-ȭͷ��1-������2-������");
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
            System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t��Ӯ���");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + isWin);
            System.out.println("==================================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
            t.count++;
        }

        System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t��Ӯ���");
        for (int a = 0; a < arr1.length; a++) {
            System.out.print(arr1[a][0] + "\t");
            for (int b = 1; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t");
            }

            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("��Ӯ��" + isWinCount + "��");
    }
}

class Tom {

    int tomGuessNum; // 0, 1, 2
    int comGuessNum;
    int winCountNum;
    int count = 1;

    public int computerNum() {
        Random r = new Random();
        comGuessNum = r.nextInt(3);// ���� 0-2�������
        return comGuessNum;
    }

    public void setTomGuessNum(int tomGuessNum) {
        if (tomGuessNum > 2 || tomGuessNum < 0) {
            throw new IllegalArgumentException("�����������");
        }
        this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum() {
        return tomGuessNum;
    }

    public String vsComputer() {
        if (tomGuessNum == 0 && comGuessNum == 1) {
            return "��Ӯ��";
        } else if (tomGuessNum == 1 && comGuessNum == 2) {
            return "��Ӯ��";
        } else if (tomGuessNum == 2 && comGuessNum == 0) {
            return "��Ӯ��";
        } else if (tomGuessNum == comGuessNum) {
            return "ƽ��";
        } else {
            return "������";
        }
    }

    public int winCount(String isWin) {
        if ("��Ӯ��".equals(isWin)) {
            winCountNum++;
        }

        return winCountNum;
    }
}