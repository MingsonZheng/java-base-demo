// 转义字符
public class ChangeChar {
    public static void main(String[] args) {
        // \t ：一个制表位，实现对齐功能
        System.out.println("北京\t天津\t上海");
        // \n ：换行符
        System.out.println("jack\nsmith\nmary");
        // \\ ：一个\
        System.out.println("C:\\windows\\System32\\cmd.exe");
        // \" ：一个"
        System.out.println("我说:\"要好好学习java,有前途\"");
        // \' ：一个'
        System.out.println("我说:\'要好好学习java,有前途\'");
        // \r ：一个回车
        System.out.println("好好教育\r北京");// 北京教育
        System.out.println("好好教育\r\n北京");
    }
}