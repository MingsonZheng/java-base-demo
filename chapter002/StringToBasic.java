//String�ͻ�������ת��
public class StringToBasic {
    public static void main(String[] args) {
        
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //String->��Ӧ�Ļ�����������
        String s5 = "123";
        //ʹ�û����������Ͷ�Ӧ�İ�װ�����Ӧ�������õ�������������
        int num1 = java.lang.Integer.parseInt(s5);
        double num2 = java.lang.Double.parseDouble(s5);
        float num3 = java.lang.Float.parseFloat(s5);
        long num4 = java.lang.Long.parseLong(s5);
        byte num5 = java.lang.Byte.parseByte(s5);
        boolean b = java.lang.Boolean.parseBoolean("true");
        short num6 = java.lang.Short.parseShort(s5);

        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(b);//true
        System.out.println(num6);//123

        //��ô���ַ���ת�����ַ�char -> ������ָ���ַ����ĵ�һ���ַ��õ�
        //�õ�s5�ַ����ĵ�һ���ַ���1��
        System.out.println(s5.charAt(0));//1

        //���벻�������б���
        //��Ҫȷ��String�����ܹ�ת����Ч����
        String str = "hello";
        // int n2 = java.lang.Integer.parseInt(str);
        // System.out.println(n2);
    }
}
