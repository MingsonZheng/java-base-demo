// For
public class ForExercise02 {
    public static void main(String[] args) {
        
        // ���������ʽ���
        // 0 + 5 = 5
        // 1 + 4 = 5
        // 2 + 3 = 5
        // 3 + 2 = 5
        // 4 + 1 = 5
        // 5 + 0 = 5

        // ����Ϊ��
        // (1) ����� 0-5 
        // (2) �����+�� 5-i
        // �������
        // (1) 5 �滻�ɱ��� n

        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}
