// �߼������
// ! �� ^
public class InverseOperator {
    public static void main(String[] args) {
        
        // ! ������ȡ�� T->F, F->T
        System.out.println(60 > 20);// T
        System.out.println(!(60 > 20));// F

        // a^b�������߼���򣬵� a �� b ��ͬʱ������Ϊ true������Ϊ false
        boolean b = (10 > 1) ^ (3 > 5);// T ^ F
        System.out.println("b=" + b);// T
    }
}