//�Զ�ת��
public class AutoConvert {
    public static void main(String[] args) {
        
        int num = 'a';//char -> int
        double d1 = 80;// int -> double
        System.out.println(num);//97
        System.out.println(d1);//80.0

        //�ж������͵����ݻ������ʱ
        //ϵͳ�����Զ�����������ת�����������������������ͣ�Ȼ���ٽ��м���
        int n1 = 10;
        // float d2 = n1 + 1.1;//���󣬽��������double
        double d2 = n1 + 1.1;
        float d3 = n1 + 1.1F;

        //�����ǰѾ��ȣ�����������������͸�ֵ�����ȣ�������С����������ʱ
        //�ͻᱨ����֮�ͻ�����Զ�����ת��
        // int n2 = 1.1;//���� double->int

        // byte, short �� char ֮�䲻���໥�Զ�ת��
        //���Ѿ���������byteʱ�����жϸ����Ƿ���byte��Χ��[-128, 127]
        byte b1 = 10;
        // byte b1 = 1000;//���󣬳���byte��Χ
        int n2 = 1;
        // byte b2 = n2;//��������Ǳ�����ֵ���ж�����
        // char c1 = b1;//����byte�����Զ�ת����char

        // byte, short, char ���߿��Լ��㣬�ڼ���ʱ����ת����int����
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        // short s2 = b2 + s1;//���󣬽��������int
        int s2 = b2 + s1;
        // byte b4 = b2 + b3;//���󣬽��������int

        //boolean������ת��
        boolean pass = true;
        // int num100 = pass;//����

        //�Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ����������������
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500 = b4 + s3 + num200 + num300;
    }
}
