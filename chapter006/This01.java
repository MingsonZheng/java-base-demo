// This
public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("��׳", 3);
        System.out.println("dog1��hashcode=" + dog1.hashCode());
        dog1.info();
        Dog dog2 = new Dog("���", 2);
        System.out.println("dog2��hashcode=" + dog2.hashCode());
        dog2.info();
    }
}

class Dog {

    String name;
    int age;

    /*
     ������ǹ��������βΣ��ܹ�ֱ��д�����������͸�����
     ���ǳ�����һ�����⣬���ݱ�����������ԭ��
     name ��ֵ���� null
     ��������name �Ǿֲ�����������������
     ��������age �Ǿֲ�����������������
     ==> ����this�ؼ��������
     */
    public Dog(String name, int age) {
        // name = name;
        // age = age;

        // this.name���ǵ�ǰ���������name
        this.name = name;
        // this.age���ǵ�ǰ���������age
        this.age = age;
        System.out.println("this.hashcode=" + this.hashCode());
    }

    public void info() {
        System.out.println("this.hashcode=" + this.hashCode());
        System.out.println(name + "\t" + age + "\t");
    }
}