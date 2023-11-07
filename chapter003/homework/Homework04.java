// 试写出将String转换成double类型的语句，以及将char类型转换成String的语句
public class Homework04 {
    public static void main(String[] args) {
        
        String str = "18.8";// 注意，字符串要可以被转成 double
        double d1 = Double.parseDouble(str);

        char c1 = '中';
        String str2 = c1 + "";
    }
}
