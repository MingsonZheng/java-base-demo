// Switch

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        
        // ���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g
        // a��ʾ����һ��b��ʾ���ڶ�
        // �����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch ������

        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ���ַ�(a-g)");
        char c1 = myScanner.next().charAt(0);
        // �� java �У�ֻҪ����ֵ���أ�����һ�����ʽ
        switch (c1) {
            case 'a':
                System.out.println("��������һ");
                break;
            case 'b':
                System.out.println("�������ڶ�");
                break;
            case 'c':
                System.out.println("����������");
                break;
            //......
            default:
                System.out.println("��������ַ�����ȷ��û��ƥ���");
                break;
        }

        System.out.println("�˳���switch������ִ�г���");
    }
}
