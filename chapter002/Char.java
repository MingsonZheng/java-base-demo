//�ַ���
public class Char {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '��';
        char c4 = 97;//˵�����ַ����Ϳ���ֱ�Ӵ��һ������
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);//�����c4��ʱ�򣬻����97��ʾ���ַ� => ����ĸ���

        //��java�У�char�ı�����һ�������������ʱ����unicode���Ӧ���ַ�
        char c5 = 97;
        System.out.println(c5);//a
        char c6 = 'a';//���'a'��Ӧ������
        System.out.println((int)c6);
        char c7 = '��';
        System.out.println((int)c7);//20013
        char c8 = 20013;
        System.out.println(c8);//��

        //char�����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode��
        System.out.println('a' + 10);//97 + 10 = 107
        char c9 = 'b' + 1;//98 + 1 = 99
        System.out.println((int)c9);//99
        System.out.println(c9);//99��Ӧ���ַ�->�����ASCII���涨�õģ�->c
    }
}
