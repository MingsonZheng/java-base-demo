// ��ת����
public class ArrayReverse02 {
    public static void main(String[] args) {
        
        int[] arr = {11, 22, 33, 44, 55, 66};

        /*
        ʹ������ֵ��ʽ
        1. �ȴ���һ���µ����� arr2,��С arr.length
        2. ������� arr ,�� ÿ��Ԫ�ؿ����� arr2��Ԫ����(˳�򿽱�)
        3. ��������һ��ѭ������ j -> 0 -> 5
         */
        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }

        arr = arr2;
        System.out.println("====arr��Ԫ�����====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
