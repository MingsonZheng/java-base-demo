// This
public class ThisDetail {
    public static void main(String[] args) {
        
        T t1 = new T();
        t1.f2();
        t1.f3();
    }
}

class T {

    String name = "jack";
    int age = 100;

    /*
     ϸ��: ���ʹ������﷨ : this(�����б�);
     ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������
     ע�� : ���ʹ������﷨ : this(�����б�); ������õ�һ�����
     */
    public T() {
        // ����ȥ���� T(String name, int age) ������
        this("jack", 100);
        System.out.println("T() ������");
    }

    public T(String name, int age) {
        System.out.println("T(String name, int age) ������");
    }

    // this�ؼ��ֿ����������ʱ��������
    public void f3() {

        String name = "smith";
        int age = 99;

        // ��ͳ��ʽ
        System.out.println("name=" + name + " age=" + age);// name=smith age=99
        // Ҳ����ʹ��this��������
        System.out.println("name=" + this.name + " age=" + this.age);// name=jack age=100
    }

    // ϸ��: ���ʳ�Ա�������﷨ : this.������(�����б�);
    public void f1() {
        System.out.println("f1() ����..");
    }

    public void f2() {
        System.out.println("f2() ����..");
        // ���ñ���� f1
        // ��һ�ַ�ʽ
        f1();
        // �ڶ��ַ�ʽ
        this.f1();
    }
}