// ��Ԫ�����
public class TernaryOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 99;
        // ���
        // 1. a > b Ϊ false
        // 2. ���� b--���ȷ��� b ��ֵ��Ȼ���� b-1
        // 3. ���صĽ���� 99
        int result = a > b ? a++ : b--;
        System.out.println("result=" + result);// 99
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // ���ʽ1�ͱ��ʽ2ҪΪ���Ը������ձ���������
        // ��������Զ�ת��/����ǿ��ת����
        int c = a > b ? (int)1.1 : (int)3.4;
        double d = a > b ? a : b + 3;// ���� int -> double

        // ʵ�������������ֵ
        int n1 = 533;
        int n2 = 33;
        int n3 = 123;
        // ˼·
        // 1. �ȵõ� n1 �� n2 ������������浽 max1
        // 2. Ȼ������� max1 �� n3 �е�����������浽 max2
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("�����=" + max2);
        // ʹ��һ�����ʵ�֣��Ƽ�ʹ������ķ���
        // �������ʹ�ø��õķ�������������
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println("�����=" + max);
    }
}
