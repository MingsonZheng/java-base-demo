// ����

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        
        /*
        ��ʾ �������� ������[]=new ��������[��С]
        ѭ������5���ɼ������浽double���飬�����
         */
        
        // 1������һ�� double ���飬��С 5
        // (1) ��һ�ֶ�̬���䷽ʽ
        // double scores[] = new double[5];
        // (2) ��2�ֶ�̬���䷽ʽ�����������飬�� new ����ռ�
        double scores[];// �������飬��ʱ scores �� nu11
        scores = new double[5];// �����ڴ�ռ䣬���Դ������

        // 2. ѭ������scores.length ��ʾ����Ĵ�С/����
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
            scores[i] = myScanner.nextDouble();
        }

        // �������������
        System.out.println("==�����Ԫ��/ֵ��������£�===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
        }
    }
}
