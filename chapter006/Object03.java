// �������
public class Object03 {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "С��";
        Person p2 = p1;
        p1.age = 80;
        System.out.println(p2.age);// 80
    }
}

class Person {
    String name;
    int age;
}