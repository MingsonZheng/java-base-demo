// ���������������ϰ02
// 1. ���绹��59��ż٣���: ��xx��������xx��
// 2. ����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ: 5/9*(�����¶�-100),����������¶ȶ�Ӧ�������¶ȡ�[234.5]
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        
        // 1. ˼·����
        // (1) ʹ�� int ���� days ��������
        // (2) һ�������� 7 �죬������ weeks : days / 7 ��xx�� days % 7
        // (3) ���
        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "�� ��" + weeks + "������" + leftDays + "��");

        // 2. ˼·����
        // (1) �ȶ���һ�� double ���� huaShi ���滪���¶�
        // (2) ���ݸ����Ĺ�ʽ�����м��㼴�� 5/9*(�����¶�-100)
        // (3) ���õ��Ľ�����浽 double ���� sheShi
        double huaShi = 234.6;
        //������ѧ��ʽ�� java ���Ե����ԣ�5 / 9 = 0
        // double sheShi = 5 / 9 * (huaShi - 100);
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("�����¶�" + huaShi + "��Ӧ�������¶�=" + sheShi);
    }
}
