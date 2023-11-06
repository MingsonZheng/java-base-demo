//强制类型转换
public class ForceConvert {
    public static void main(String[] args) {
        
        int n1 = (int)1.9;
        System.out.println("n1=" + n1);//1，造成精度损失

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1);//-48，造成数据溢出

        //强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        // int x = (int)10*3.5+6*1.5;//错误，结果类型为double
        int x = (int)(10*3.5+6*1.5);//(int)44.0->44
        System.out.println(x);//44

        char c1 = 100;
        int m = 100;
        // char c2 = m;//错误
        char c3 = (char)m;
        System.out.println(c3);//100对应的字符d
    }
}
