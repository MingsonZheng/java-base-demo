//编程，保存两本书名，用+拼接，看效果
//保存两个性别，用加号拼接，看效果
//保存两本书价格，用加号拼接，看效果
public class Homework03 {
    public static void main(String[] args) {
        
        String book1 = "天龙八部";
        String book2 = "笑傲江湖";
        System.out.println(book1 + book2);//天龙八部笑傲江湖

        char c1 = '男';
        char c2 = '女';
        System.out.println(c1 + c2);//得到男的字符码值加女的字符码值等于52906

        double price1 = 123.56;
        double price2 = 100.11;
        System.out.println(price1 + price2);//223.67000000000002
    }
}