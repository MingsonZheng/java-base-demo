// ð������
public class BubbleSort {
    public static void main(String[] args) {
        
        /*
        ���� [24,69,80,57,13]
        ��1������: Ŀ���������������
        ��1�αȽ�[24,69,80,57,13]
        ��2�αȽ�[24,69,80,57,13]
        ��3�αȽ�[24,69,57,80,13]
        ��4�αȽ�[24,69,57,13,80]
         */
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        for (int j = 0; j < 4; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("==��1��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println();

        /*
        ��2������: Ŀ��ѵڶ��������ڵ����ڶ�λ��
        ��1�αȽ�[24,69,57,13,80]
        ��2�αȽ�[24,57,69,13,80]
        ��3�αȽ�[24,57,13,69,80]
         */
        for (int j = 0; j < 3; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("==��2��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println();

        /*
        ��3������:Ŀ��ѵ�3�������ڵ�����3λ��
        ��1�αȽ�[24,57,13,69,80]
        ��2�αȽ�[24,13,57,69,80]
         */
        for (int j = 0; j < 2; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("==��3��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println();

        /*
        ��4������: Ŀ��ѵ�4�������ڵ�����4λ��
        ��1�αȽ�[13,24,57,69,80]
         */
        for (int j = 0; j < 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("==��4��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("");

        // ����Ϊ��
        int[] arr2 = {24, 69, 80, 57, 13};
        arr = arr2;
        temp = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println("==��" + (i + 1) + "��==");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }

            System.out.println();
        }
    }
}