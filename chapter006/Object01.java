// 类与对象
public class Object01 {
    public static void main(String[] args) {
        
        /*
         * 张老太养了两只猫猫:一只名字叫小白,今年3岁，白色。
         * 还有一只叫小花，今年108岁,花色。请编写一个程序，当用户输入小猫的名字时.
         * 就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误,
         * 则显示 张老太没有这只猫猫。
         */
        // 单独变量来解决 =>不利于数据的管理(你把一只猫的信息拆解 )
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        String cat2Name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";

        // 数组
        // (1)数据类型体现不出来
        // (2) 只能通过[下标]获取信息，造成变量名字和内容的对应关系不明确
        // (3) 不能体现猫的行为第1只猫信息
        String[] cat1 = {"小白", "3", "白色"};
        String[] cat2 = {"小花", "100", "花色"};

        // 使用OOP面向对象解决
        // 实例化一只猫[创建一只猫对象]
        Cat cat11 = new Cat();
        cat11.name = "小白";
        cat11.age = 3;
        cat11.color = "白色";

        System.out.println("第一只猫信息" + cat11.name + " " + cat11.age + " " + cat11.color);
    }
}

// 使用面向对象的方式来解决养猫问题
// 定义一个猫类 cat -> 自定义的数据类型
class Cat {
    String name;
    int age;
    String color;
}