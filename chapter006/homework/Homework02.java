// ��ҵ
public class Homework02 {
    public static void main(String[] args) {
        
        String[] strs = {"jack", "tom", "mary", "milan"};
        A02 a02 = new A02();
        int index = a02.find("milan", strs);
        System.out.println("���ҵ�index=" + index);
    }
}

/*
 ��д��A02,���巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ���������
 ����������������Ҳ���������-1
 ����
 1. ���� A2
 2. ������ find
 3. ����ֵ int
 4. �β� (String ��string[])
 */
class A02 {

    public int find(String findStr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}