//ǿ������ת��
public class ForceConvert {
    public static void main(String[] args) {
        
        int n1 = (int)1.9;
        System.out.println("n1=" + n1);//1����ɾ�����ʧ

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1);//-48������������

        //ǿת����ֻ���������Ĳ�������Ч��������ʹ��С�����������ȼ�
        // int x = (int)10*3.5+6*1.5;//���󣬽������Ϊdouble
        int x = (int)(10*3.5+6*1.5);//(int)44.0->44
        System.out.println(x);//44

        char c1 = 100;
        int m = 100;
        // char c2 = m;//����
        char c3 = (char)m;
        System.out.println(c3);//100��Ӧ���ַ�d
    }
}
