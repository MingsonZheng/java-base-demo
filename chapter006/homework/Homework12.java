// ��ҵ
public class Homework12 {
    public static void main(String[] args) {
        
    }
}

/*
 ����һ��Employee��
 ������(���֣��Ա����䣬ְλ��нˮ)���ṩ3�����췽�������Գ�ʼ��
 (1)(���֣��Ա����䣬ְλ��нˮ)��
 (2)(���֣��Ա�����) 
 (3) (ְλ��нˮ)��Ҫ���ָ��ù�����
 */
class Employee {

    String name;
    char gender;
    int age;
    String job;
    double sal;

    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job, double sal, String name, char gender, int age) {
        this(name, gender, age);
        this.job = job;
        this.sal = sal;
    }
}