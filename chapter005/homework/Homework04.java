// ��ҵ
public class Homework04 {
    public static void main(String[] args) {
        
        /*
        ��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ�����򣬱���:
        [10�� 12��45�� 90]�� ���23 ������Ϊ [10, 12��23�� 45�� 90]
        
        ˼· ������������ + ��λ
        1. ������ȷ�� �����Ӧ�ò��뵽�ĸ�����
        2. Ȼ������
         */
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;

        /*
        ���� arr���飬������� insertNum<=arr[i]��˵�� i ����Ҫ�����λ��
        ʹ�� index ���� index = i;
        ����������û�з��� insertNum<=arr[i]�� ˵�� index = arr.length
        �� : ��ӵ�arr�����
         */
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            index = arr.length;
        }

        int[] arrNew = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = insertNum;
            }
        }

        arr = arrNew;

        System.out.println("======�����arr�����Ԫ�����======");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
