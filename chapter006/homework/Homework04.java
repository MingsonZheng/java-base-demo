// ��ҵ
public class Homework04 {
    public static void main(String[] args) {
        
        int[] oldArr = {10, 30, 50};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);

        System.out.println("==���ص�newArrԪ�����==");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}

// ��д��A03��ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��
class A03 {

    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        return newArr;
    }
}