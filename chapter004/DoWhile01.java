// While

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        
        int i = 1;
        do {
            System.out.println("hello, world" + i);
            i++;
        }while(i <= 10);

        // ͳ��1---200֮���ܱ�5���������ܱ�3������ ����
        // ����Ϊ��
        // (1) ʹ��do-while��� 1-200
        // (2) ���� �ܱ�5���������ܱ�3�������� %
        // (3) ͳ�����������ĸ��� int count = 0;
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

        // �����������Ǯ�������Ľ�һֱʹ�������ޣ�ֱ������˵��ǮΪֹ
        // [System.out.println("������ :��Ǯ�� ? y/n��)] do...while
        // ����Ϊ��
        // (1) ��ͣ���ʻ�Ǯ��?
        // (2) ʹ��char answer ���գ�����һ��Scanner����
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("������ :��Ǯ�� ? y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("���Ļش���" + answer);
        }while (answer != 'y');

        System.out.println("������Ǯ��");
    }
}
