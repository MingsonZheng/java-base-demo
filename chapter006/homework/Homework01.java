// ��ҵ
public class Homework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {1.0, 4.7, 1.8};
        System.out.println("arr�����ֵ=" + a01.max(arr));

        double[] arr2 = {};
        System.out.println("arr2�����ֵ=" + a01.max(arr2));

        double[] arr3 = null;
        Double res = a01.max(arr3);
        if (res != null) {
            System.out.println("arr3�����ֵ=" + a01.max(arr3));    
        } else {
            System.out.println("arr3�������������鲻��Ϊ null������{}");
        }
        
    }
}

/*
 ��д��A01�����巽��max��ʵ����ĳ��double��������ֵ��������

 ˼·����
 1. ���� A01
 2. ������ max
 3. �β� (double[])
 4�� ����ֵ double
 */
class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            return max;
        } else {
            return null;
        }
    }
}