// ������ϰ��
public class MethodExercise01 {
    public static void main(String[] args) {
        
        AA a = new AA();
        if (a.isodd(1)) {
            System.out.println("������");
        } else {
            System.out.println("��ż��");
        }

        a.print(4, 4, '#');
    }
}

// ��д��AA ����һ������ :�ж�һ����������odd����ż��������boolean
class AA {

    /*
    ˼·
    1. �����ķ������� boolean
    2. ���������� isodd
    3. �������β� (int num)
    4. ������ ���ж�
     */
    public boolean isodd(int num) {
        // if (num % 2 != 0) {
        //     return true;
        // } else {
        //     return false;
        // }

        // return num % 2 != 0 ? true : false;

        return num % 2 != 0;
    }

    /*
    �����С��С��ַ���ӡ ��Ӧ�������������ַ�
    ����:��:4����:4���ַ�#,���ӡ��Ӧ��Ч��
    ####
    ####
    ####
    ####
    
    ˼·
    1. �����ķ������� void
    2. ���������� print
    3. �������β� (int row��int col��char c)
    4. ������ ��ѭ��
     */
    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}