public class Homework01 {
    public static void main(String[] args) {
        
        /*
        ĳ����100,000Ԫ,ÿ����һ��·�ڣ���Ҫ����,��������
        1) ���ֽ�>50000ʱ,ÿ�ν�5%
        2) ���ֽ�<=50000ʱ,ÿ�ν�1000
        ��̼�����˿��Ծ������ٴ�·�ڣ�Ҫ��: ʹ�� while + break��ʽ���

        ˼·����
        1.���� double money ���� 100000
        2 .�������Ҫ�����Ƿ����������������
        money > 50000
        money >=1000 && money <= 50000
         */

         double money = 100000;
         int count = 0;
         while (true) {
            if (money > 50000) {
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
            System.out.println("100000���Թ�" + count + "·��..");
         }
    }
}
