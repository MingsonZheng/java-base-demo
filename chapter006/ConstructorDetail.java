// ������
public class ConstructorDetail {
    public static void main(String[] args) {
        
        Person p1 = new Person("king", 40);// ��1��������
        Person p2 = new Person("tom");// ��2��������

        Dog dog1 = new Dog();
    }
}

class Dog {
    
    /*
    �������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲ι�����(Ҳ��Ĭ�Ϲ�����)
    �������Աû�ж��幹����ʹ��javapָ�� �����뿴��
    javap Dog.class
    Ĭ�Ϲ�����
    Dog() {
        
    }
     */
    // һ���������Լ��Ĺ�������Ĭ�ϵĹ������͸����ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι�����
    // ������ʽ�Ķ���һ��,��: Dog() д (������Ҫ)
    // javap Dog.class
    // public Dog(java.lang.String);
    public Dog(String dName) {

    }

    Dog() {
        
    }
}

class Person {
    
    String name;
    int age;// Ĭ��0

    // ��1��������
    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    // ��2����������ָֻ������������Ҫָ������
    public Person(String pName) {
        name = pName;
    }
}