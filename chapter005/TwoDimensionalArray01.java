// ��ά����
public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        
        /*
        ���ö�ά�����������ͼ��
        0 0 0 0 0 0
        0 0 1 0 0 0
        0 2 0 3 0 0
        0 0 0 0 0 0
         */
        int[][] arr = {{0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0},
                        {0, 2, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0}};
        
        System.out.println("��ά�����Ԫ�ظ���=" + arr.length);

        System.out.println("��3��һά����ĵ�4��ֵ=" + arr[2][3]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("======================");

        int arr2[][];// ������ά����
        arr2 = new int[2][3];// �ٿ��ռ�
        arr2[1][1] = 8;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("======================");

        /*
        ��һ������ : ��̬���������ά���飬�����
        i = 0: 1
        i = 1: 2 2
        i = 2: 3 3 3
        һ��������һά���飬ÿ��һά�����Ԫ���ǲ�һ����
         */
        int[][] arr3 = new int[3][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i+1];

            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
