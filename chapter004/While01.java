// While
public class While01 {
    public static void main(String[] args) {
        
        int i = 1;
        while (i <= 10) {
            System.out.println("hello, world" + i);
            i++;
        }

        // ��ӡ1-100֮�������ܱ�3��������
        i = 1;
        int endNum = 100;
        while (i <= endNum) {
            if (i % 3 == 0) {
                System.out.println("i=" + i);
            }
            i++;
        }

        // ��ӡ40-200֮�����е�ż��
        int j = 40;
        while (j <= 200) {
            if (j % 2 == 0) {
                System.out.println("j=" + j);
            }
            j++;
        }
    }
}
