// ˫��֧

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        
        // ��дһ������,���������˵�����,�����ͬ־���������18��,
        // ����������������18,Ҫ���Լ�����Ϊ����,�����������
        // ����,�����������䲻����ηŹ����ˡ�
        // ˼·����
        // 1. ������������䣬Ӧ�ö���һ�� Scanner ����
        // 2. �����䱣�浽һ������ int age
        // 3. ʹ�� if-else �жϣ������Ӧ��Ϣ
        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("���������18,Ҫ���Լ�����Ϊ����,�������");
        } else {// ˫��֧
            System.out.println("������䲻����ηŹ�����");
        }
        System.out.println("�������...");
    }
}
