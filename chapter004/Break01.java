// Break
public class Break01 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i=" + i);
        }

        System.out.println("�˳�forѭ��������ִ��...");

        lable1:
        for (int j = 0; j < 4; j++) {// ���for
        lable2:
            for (int i = 0; i < 10; i++) {// �ڲ�for
                if (i == 2) {
                    break;// �ȼ� break lable2
                }
                System.out.println("i=" + i);
            }
        }

        System.out.println("===================");

        lable1:
        for (int j = 0; j < 4; j++) {// ���for
        lable2:
            for (int i = 0; i < 10; i++) {// �ڲ�for
                if (i == 2) {
                    break lable1;
                }
                System.out.println("i=" + i);
            }
        }
    }
}
