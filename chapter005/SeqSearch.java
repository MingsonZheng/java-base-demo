// ����

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        
        /*
        ��һ������:��üӥ������ëʨ����������������������������Ϸ :
        �Ӽ�������������һ�����ƣ��ж��������Ƿ����������[˳�����]
        Ҫ��:����ҵ��ˣ�����ʾ�ҵ����������±�ֵ

        ˼·����
        1. ����һ���ַ�������
        2. �����û����룬�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
         */
        String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("����������");
        String findName = myScanner.next();

        int index = -1;// ���˼��
        for (int i = 0; i < names.length; i++) {
            if (findName.equals(names[i])) {
                System.out.println("��ϲ���ҵ� " + findName);
                System.out.println("�±�Ϊ=" + i);
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("sorry, û���ҵ� " + findName);
        }
    }
}
