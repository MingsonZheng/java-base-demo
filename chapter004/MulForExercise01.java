// ����ѭ��

import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        
        // ͳ��3����ɼ������ÿ������5��ͬѧ��
        // ����������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]
        // ͳ�������༰��������ÿ������5��ͬѧ��
        // 
        // ˼·����:
        // ����Ϊ��
        // (1) �ȼ���һ���� ��5��ѧ���ĳɼ���ƽ���֣�ʹ��for
        // l.1 ���� Scanner ����Ȼ�󣬽����û�����
        // 1.2 �õ��ð༶��ƽ���� ������һ�� doubel sum �Ѹð༶5��ѧ���ĳɼ��ۻ�
        // (2) ͳ��3����(ÿ����5��ѧ��) ƽ����
        // (3) ���а༶��ƽ����
        // 3.1 ����һ��������double totalScore �ۻ�����ѧ���ĳɼ�
        // 3.2 ������ѭ��������totalscore / (3 * 5)
        // (4) ͳ�������༰������
        // 4.1 ������� int passNum = 0; ����һ��ѧ���ɼ�>=60��passNum++
        // (5) �����Ż�[Ч�ʣ��ɶ��ԣ��ṹ]

        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0;
        int classNum = 3;
        int stuNum = 5;
        for (int i = 1; i <= classNum; i++) {
            double sum = 0;
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("�������" + i + "����ĵ�" + j + "��ѧ���ĳɼ�");
                double score = myScanner.nextDouble();
                if (score >= 60) {
                    passNum++;
                }
                sum += score;
                System.out.println("�ɼ�Ϊ" + score);
            }
            System.out.println("sum=" + sum + " ƽ����=" + (sum / stuNum));
            totalScore += sum;
        }
        System.out.println("�������ܷ�=" + totalScore + " ƽ����=" + totalScore / (classNum * stuNum));
        System.out.println("��������=" + passNum);
    }
}
