public class Homework01 {
    public static void main(String[] args) {
        
        System.out.println(10 / 3);// 3
        System.out.println(10 / 5);// 2
        System.out.println(10 % 2);// 0
        // a % b
        // �� a ��С��ʱ����ʽ = a - (int)a / b * b
        // -10.5 % 3 = -10.5 - (-10) / 3 * 3 = -10.5 + 9 = -1.5
        System.out.println(-10.5 % 3);// -1.5
        // ע�⣺��С�����㣬�õ�����ǽ���ֵ
        System.out.println(-10.4 % 3);// -1.4000000000000004
    }    
}
