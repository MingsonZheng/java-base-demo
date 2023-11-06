//字符型
public class Char {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '中';
        char c4 = 97;//说明：字符类型可以直接存放一个数字
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);//当输出c4的时候，会输出97表示的字符 => 编码的概念

        //在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
        char c5 = 97;
        System.out.println(c5);//a
        char c6 = 'a';//输出'a'对应的数字
        System.out.println((int)c6);
        char c7 = '中';
        System.out.println((int)c7);//20013
        char c8 = 20013;
        System.out.println(c8);//中

        //char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
        System.out.println('a' + 10);//97 + 10 = 107
        char c9 = 'b' + 1;//98 + 1 = 99
        System.out.println((int)c9);//99
        System.out.println(c9);//99对应的字符->编码表ASCII（规定好的）->c
    }
}
