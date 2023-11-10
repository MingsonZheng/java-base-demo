// This��ϰ
public class TestPerson {
    public static void main(String[] args) {
        
        Person p1 = new Person("mary", 20);
        Person p2 = new Person("smith", 30);
        System.out.println(p1.compareTo(p2));
    }
}

/*
 ����Person�࣬������name��age���ԣ����ṩcompareTo�ȽϷ���
 �����ж��Ƿ����һ������ȣ��ṩ������TestPerson���ڲ��ԣ�
 ���ֺ�������ȫһ�����ͷ���true�����򷵻�false
 */
class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}