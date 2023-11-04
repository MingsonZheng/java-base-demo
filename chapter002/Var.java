//变量
public class Var {
    public static void main(String[] args) {
        
        //声明变量
        int a;
        a = 100;
        System.out.println(a);

        //还可以这样使用
        int b = 800;
        System.out.println(b);

        //记录人的信息
        int age = 30;
        double score = 88.9;
        char gender = '男';
        String name = "king";
        //输出信息
        System.out.println("人的信息如下:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);

        //变量必须先声明，后使用，即有顺序
        int c = 50;
        System.out.println(c);
        //该区域的数据/值可以在同一类型范围内不断变化
        // c = "jack";//错误
        c = 88;
        System.out.println(c);
        //变量在同一作用域内不能重名
        // int c = 77;//错误
    }
}
