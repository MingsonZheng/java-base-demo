// Switch
public class SwitchDetail {
    public static void main(String[] args) {
        
        // ϸ��1
        // ���ʽ�������ͣ�Ӧ�� case ��ĳ�������һ��
        // �����ǿ����Զ�ת�ɿ��Ի���Ƚϵ����ͣ�������������ַ����������� int

        // ϸ��2
        // switch(���ʽ)�б��ʽ�ķ���ֵ�����ǣ�
        // (byte, short, int, char, enum[ö��], String)

        // ϸ��3
        // case �Ӿ��е�ֵ�����ǳ���(1, 'a')���������Ǳ���

        // ϸ��4
        // default �Ӿ��ǿ�ѡ�ģ���û��ƥ��� case ʱ��ִ�� default
        // ���û�� default �Ӿ䣬��û��ƥ���κγ�������û�����

        // ϸ��5
        // break ���������ִ����һ�� case ��֧��ʹ�������� switch ���飻
        // ���û��д break�������˳��ִ�е� switch ��β

        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("ok1");
                break;
            case 20:
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
    }
}
