// ��¡����
public class MethodExercise02 {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.name = "milan";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);

        // ���� p �� p2��Person���󣬵��������������Ķ���������ͬ
        System.out.println("p������ age=" + p.age + " ����=" + p.name);
        System.out.println("p2������ age=" + p2.age + " ����=" + p2.name);

        // ����ͨ������ȽϿ����Ƿ�Ϊͬһ������
        System.out.println(p == p2);
    }
}

class Person {
    String name;
    int age;
}

class MyTools {

    /*
    ��дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ��󡣿�¡����,
    ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
    
    ��д������˼·
    1. �����ķ������� Person
    2. ���������� copyPerson
    3. �������β� (Person p)
    4. �����壬����һ���¶��󣬲��������ԣ����ؼ���
     */
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}