// ����ѭ��
public class Stars {
    public static void main(String[] args) {
        
        // ����Ĵ�ӡ������
        // ʹ�� for ѭ���������İ���
        // ���дһ�����򣬿��Խ���һ������,��ʾ����(totalLevel)��ӡ��������
        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********

        // ˼·����
        // ����Ϊ��
        // 1. �ȴ�ӡһ������
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }

        // 2. ��ӡ���������
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 3. ��ӡ����������
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        for (int i = 1; i <= 5; i++) {
            // �����*֮ǰ��������� ��Ӧ�ո� = �ܲ���-��ǰ��
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 4. ��ӡ���ĵĽ�����
        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********
        for (int i = 1; i <= 5; i++) {
            // �����*֮ǰ��������� ��Ӧ�ո� = �ܲ���-��ǰ��
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                // ��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*�����һ��ȫ��*
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // �������
        // 5 �������ɱ��� int totalLevel = 5;
        int totalLevel = 5;
        for (int i = 1; i <= totalLevel; i++) {
            // �����*֮ǰ��������� ��Ӧ�ո� = �ܲ���-��ǰ��
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                // ��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*�����һ��ȫ��*
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
