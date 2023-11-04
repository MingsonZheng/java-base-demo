//javac Hello.java
//java Hello
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello,world~");
    }
}

//注释有中文需要设置编码为GBK才可以编译通过
//一个源文件中最多只能有一个public类。其他类的个数不限。
//编译后，每一个类，都对应一个.class
//javac Hello.java
//java Dog
//java Tiger
//java Hello
class Dog {
    public static void main(String[] args) {
        System.out.println("hello, 小狗狗~");
    }
}

class Tiger {
    public static void main(String[] args) {
        System.out.println("hello, 小老虎~");
    }
}