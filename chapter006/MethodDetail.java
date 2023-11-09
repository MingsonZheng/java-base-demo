// 方法
public class MethodDetail {
    public static void main(String[] args) {
        
        AA a = new AA();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);

        // 细节: 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1, b2);// byte -> int
        // a.getSumAndSub(1.1, 1.8);// double -> int
    }
}

class AA {

    // 1.一个方法最多有一个返回值 [思考，如何返回多个结果 返回数组 ]
    public int[] getSumAndSub(int n1, int n2) {
        int[]  resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    /*
    2. 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
    看 getSumAndSub
    3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值;
    而且要求返回值类型必须和return的值类型一致或兼容
     */
    public double f1() {
        double d1 = 1.1 * 3;
        int n = 100;
        // return d1;
        return n;// int -> double
    }

    // 如果方法是void，则方法体中可以没有return语句，或者 只写 return
    // 在实际工作中，我们的方法都是为了完成某个功能，所以方法名要有一定含义最好是见名知意
    public void f2() {
        System.out.println("hello1");
        System.out.println("hello1");
        System.out.println("hello1");
        // return;
    }
}