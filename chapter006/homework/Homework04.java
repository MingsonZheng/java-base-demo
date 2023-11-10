// 作业
public class Homework04 {
    public static void main(String[] args) {
        
        int[] oldArr = {10, 30, 50};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);

        System.out.println("==返回的newArr元素情况==");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}

// 编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
class A03 {

    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        return newArr;
    }
}