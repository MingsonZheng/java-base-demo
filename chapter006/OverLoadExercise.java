// ������ϰ
public class OverLoadExercise {
    public static void main(String[] args) {
        
        Methods method = new Methods();
        method.m(10);
        method.m(10, 20);
        method.m("hello, world");

        System.out.println(method.max(10, 24));
        System.out.println(method.max(10.0, 21.4));
        System.out.println(method.max(10.0, 1.4, 30));
    }
}

/*
��д������Methods�ж����������ط��������á�������Ϊm��
���������ֱ����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢������
��˲�������������ַ�����Ϣ���������main ()�����зֱ��ò������������������

�����������ط���max()��
��һ����������������intֵ�е����ֵ
�ڶ�����������������doubleֵ�е����ֵ��
������������������doubleֵ�е����ֵ�����ֱ������������
 */
class Methods {

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max (double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max (double n1, double n2, double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }

    public void m(int n) {
        System.out.println("ƽ��=" + (n * n));
    }

    public void m(int n1, int n2) {
        System.out.println("���=" + (n1 * n2));
    }

    public void m(String str) {
        System.out.println("����� str=" + str);
    }
}