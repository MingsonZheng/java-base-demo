// ������
public class VarScope {
    public static void main(String[] args) {
        
    }
}

class Cat {

    /*
    ȫ�ֱ���: Ҳ�������ԣ�������Ϊ�������� Cat�� :cry eat �ȷ���ʹ������
    �����ڶ���ʱ������ֱ�Ӹ�ֵ
     */
    int age = 10;

    /*
    ȫ�ֱ���(����)���Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ.
    �ֲ��������븳ֵ�󣬲���ʹ�ã���Ϊû��Ĭ��ֵ
     */
    double weight;// Ĭ��ֵ��0.0

    {
        int num = 100;
    }

    public void cry() {

        /*
        1. �ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
        2. n �� name ���Ǿֲ�����
        3. n �� name���������� cry������
         */
        int n = 10;
        String name = "jack";
        System.out.println("��cry��ʹ������ age=" + age);
    }

    public void eat() {
        System.out.println("��eat��ʹ������ age=" + age);
    }
}