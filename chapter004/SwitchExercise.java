// Switch

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        
        // ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��
        // ֻת�� a,b,c,d,e.�����������other"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������a-e");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
                break;
        }
        
        // ��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�
        // (ע: ����ĳɼ����ܴ���100)
        // ��ʾ �ɼ�/60
        double score = 88.5;
        if (score >= 0 && score <= 100) {
            switch ((int)(score / 60)) {
                case 0:
                    System.out.println("���ϸ�");
                    break;
                case 1:
                    System.out.println("�ϸ�");
                    break;            
            }
        } else {
            System.out.println("����ĳɼ���0~100");
        }
        
        // ��������ָ���·ݴ�ӡ���·������ļ��ڡ�
        // 3,4,5 ���� 6,7.8 �ļ� 9,10,11�＾ 12,1,2 ����
        // [��ʾ ʹ�ô�͸]
        System.out.println("�����·�");
        int month = myScanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("���Ǵ���");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("�����ļ�");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����＾");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("���Ƕ���");
                break;        
            default:
                System.out.println("��������·ݲ���(1-12)");
        }
    }
}