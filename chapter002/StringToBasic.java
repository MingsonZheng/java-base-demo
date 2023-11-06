//String和基本类型转换
public class StringToBasic {
    public static void main(String[] args) {
        
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //String->对应的基本数据类型
        String s5 = "123";
        //使用基本数据类型对应的包装类的相应方法，得到基本数据类型
        int num1 = java.lang.Integer.parseInt(s5);
        double num2 = java.lang.Double.parseDouble(s5);
        float num3 = java.lang.Float.parseFloat(s5);
        long num4 = java.lang.Long.parseLong(s5);
        byte num5 = java.lang.Byte.parseByte(s5);
        boolean b = java.lang.Boolean.parseBoolean("true");
        short num6 = java.lang.Short.parseShort(s5);

        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(b);//true
        System.out.println(num6);//123

        //怎么把字符串转换成字符char -> 含义是指把字符串的第一个字符得到
        //得到s5字符串的第一个字符‘1’
        System.out.println(s5.charAt(0));//1

        //编译不报错，运行报错
        //需要确保String类型能够转成有效数据
        String str = "hello";
        // int n2 = java.lang.Integer.parseInt(str);
        // System.out.println(n2);
    }
}
