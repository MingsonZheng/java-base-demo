public class Homework06 {
    public static void main(String[] args) {
        
        /*
        ���1-100֮��Ĳ��ܱ�5����������ÿ5��һ��

        ˼·����
        1�������1-100��������
        2.Ȼ�������� ���ܱ�5�������� i % 5 !=0
        3.ÿ5��һ�У�����ʹ�� int count ͳ������ĸ��� �� count%5=0��˵��
        �����5������ʱ��������� һ�����м��ɿ���
         */

         int count = 0;
         for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + "\t");

                if (count % 5 == 0) {
                    System.out.println();
                }
            }
         }
    }
}
