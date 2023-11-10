// This
public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大壮", 3);
        System.out.println("dog1的hashcode=" + dog1.hashCode());
        dog1.info();
        Dog dog2 = new Dog("大黄", 2);
        System.out.println("dog2的hashcode=" + dog2.hashCode());
        dog2.info();
    }
}

class Dog {

    String name;
    int age;

    /*
     如果我们构造器的形参，能够直接写成属性名，就更好了
     但是出现了一个问题，根据变量的作用域原则
     name 的值就是 null
     构造器的name 是局部变量，而不是属性
     构造器的age 是局部变量，而不是属性
     ==> 引出this关键字来解决
     */
    public Dog(String name, int age) {
        // name = name;
        // age = age;

        // this.name就是当前对象的属性name
        this.name = name;
        // this.age就是当前对象的属性age
        this.age = age;
        System.out.println("this.hashcode=" + this.hashCode());
    }

    public void info() {
        System.out.println("this.hashcode=" + this.hashCode());
        System.out.println(name + "\t" + age + "\t");
    }
}