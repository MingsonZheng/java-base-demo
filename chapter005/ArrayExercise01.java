// ������ϰ
public class ArrayExercise01 {
    public static void main(String[] args) {
        
        /*
        ����һ��char���͵�26��Ԫ�ص����飬�ֱ� ����'A'-'Z'
        ʹ��forѭ����������Ԫ�ز���ӡ������
        ��ʾ :char������������ A'+1 ->B

        ˼·����
        1. ����һ�� ���� char[] chars = new char[26]
        2. ��Ϊ'A'+ 1 =B ���ƣ�����ʹ��for����ֵ
        3. ʹ��forѭ����������Ԫ��
         */
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)('A' + i);
        }

        System.out.println("===chars����===");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + " ");
        }
    }
}
