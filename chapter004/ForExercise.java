// For
public class ForExercise {
    public static void main(String[] args) {
        
        // ��ӡ1~100֮��������9�ı�����������ͳ�Ƹ��� �� �ܺ�
        
        // �������˼��(����)
        // 1. ����Ϊ�� : �������ӵ����󣬲��ɼ򵥵����������
        // 2. ������� : �ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ

        // ˼·����
        // ����Ϊ��
        // (1) ��� ��� 1-100 ��ֵ
        // (2) ������Ĺ����У����й��ˣ�ֻ���9�ı��� i % 9 ==0
        // (3) ͳ�Ƹ��� ����һ������ int count = 0; �� ��������ʱcount++;
        // (4) �ܺ� ������һ������ int sum = 0; ����������ʱ�ۻ� sum += i;
        // �������
        // (1) Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼ��ֵ�ͽ�����ֵ����������
        // (2) �����Ը���һ�� 9 ����Ҳ���ɱ��� int t = 9;

        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 9;
        for (int i = start; i <= end; i++) {
            if (i % t == 0) {
                System.out.println("i=" + i);
                count++;
                sum += i;
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}
