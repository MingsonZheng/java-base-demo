// �ɱ����
public class VarParameter01 {
    public static void main(String[] args) {
        ZzmMethod m = new ZzmMethod();
        m.sum(1, 2, 3, 4, 5);
        m.sum(1, 2, 3, 4, 5, 6);
        m.sum(1, 2, 3, 4, 5, 6, 7);
    }
}

class ZzmMethod {

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int sum(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    /*
    �������������������ͬ��������ͬ������������ͬ-> ʹ�ÿɱ�����Ż�
    ���
    1. int...��ʾ���ܵ��ǿɱ������������int ,�����Խ��ն��int(0-��)
    2. ʹ�ÿɱ����ʱ�����Ե���������ʹ�� �� nums ���Ե�������
     */
    public int sum(int... nums) {
        System.out.println("���յĲ�������=" + nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}