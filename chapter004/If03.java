// ���֧

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        
        // ���뱣��ͬ־��֥�����÷�
        // ���:
        // 1. ���÷�Ϊ100��ʱ����� ���ü���
        // 2. ���÷�Ϊ(80��99]ʱ����� ��������
        // 3. ���÷�Ϊ[60,80]ʱ����� ����һ��
        // 4. ������������ ���ò�����
        // 5. ��Ӽ������뱣����֥�����÷֣��������ж�

        Scanner myScanner = new Scanner(System.in);
        // �����û�����
        System.out.println("���������÷֣�");
        int grade = myScanner.nextInt();

        // �ȶ���������÷֣�����һ����Χ����Ч�ж� 1-100�����������������
        if (grade >= 1 && grade <= 100) {
            // ��Ϊ��4�����������ʹ�ö��֧
            if (grade == 100) {
                System.out.println("���ü���");
            } else if (grade > 80 && grade <= 99) {
                System.out.println("��������");
            } else if (grade >= 60 && grade <= 80) {
                System.out.println("����һ��");
            } else {
                System.out.println("���ò�����");
            }   
        } else {
            System.out.println("���÷���Ҫ��1-100�����������룺��");
        }
    }
}
