//自动转换
public class AutoConvert {
    public static void main(String[] args) {
        
        int num = 'a';//char -> int
        double d1 = 80;// int -> double
        System.out.println(num);//97
        System.out.println(d1);//80.0

        //有多种类型的数据混合运算时
        //系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
        int n1 = 10;
        // float d2 = n1 + 1.1;//错误，结果类型是double
        double d2 = n1 + 1.1;
        float d3 = n1 + 1.1F;

        //当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时
        //就会报错，反之就会进行自动类型转换
        // int n2 = 1.1;//错误 double->int

        // byte, short 和 char 之间不会相互自动转换
        //当把具体数赋给byte时，先判断该数是否在byte范围内[-128, 127]
        byte b1 = 10;
        // byte b1 = 1000;//错误，超过byte范围
        int n2 = 1;
        // byte b2 = n2;//错误，如果是变量赋值，判断类型
        // char c1 = b1;//错误，byte不能自动转换成char

        // byte, short, char 三者可以计算，在计算时首先转换成int类型
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        // short s2 = b2 + s1;//错误，结果类型是int
        int s2 = b2 + s1;
        // byte b4 = b2 + b3;//错误，结果类型是int

        //boolean不参与转换
        boolean pass = true;
        // int num100 = pass;//错误

        //自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500 = b4 + s3 + num200 + num300;
    }
}
