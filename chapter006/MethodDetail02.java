// ����
public class MethodDetail02 {
    public static void main(String[] args) {
        
        A a = new A();
        a.sayOK();

        a.m1();
    }
}

class A {

    // ͬһ�����еķ������� : ֱ�ӵ��ü���
    public void print(int n) {
        System.out.println("print()���������� n=" + n);
    }

    public void sayOK() {
        print(10);
        System.out.println("����ִ��sayOK()");
    }

    // �����еķ���A�����B�෽��: ��Ҫͨ������������
    public void m1() {

        System.out.println("m1()����������");
        B b = new B();
        b.h1();

        System.out.println("m1()����ִ��");
    }
}

class B {

    public void h1() {
        System.out.println("B���е�hi()��ִ��");
    }
}