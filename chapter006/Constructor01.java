// ������
public class Constructor01 {
    public static void main(String[] args) {
        
        // ������newһ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
        Person p1 = new Person("smith", 80);
        System.out.println("p1����Ϣ���£�");
        System.out.println("p1����name=" + p1.name);
        System.out.println("p1����age=" + p1.age);
    }
}

// �ڴ�������Ķ���ʱ����ֱ��ָ�������������������
class Person {
    
    String name;
    int age;

    /*
    ������
    ���
    1. ������û�з���ֵ��Ҳ����дvoid
    2. �����������ƺ���Personһ��
    3. (string pName��int pAge) �ǹ������β��б�����ͳ�Ա����һ��
     */
    public Person(String pName, int pAge) {
        System.out.println("������������");
        name = pName;
        age = pAge;
    }
}