// �ɱ������ϰ
public class VarParameterExercise {
    public static void main(String[] args) {
        
        ZzmMethod m = new ZzmMethod();
        System.out.println(m.showScore("milan", 90.1, 80.0));
    }
}

class ZzmMethod {

    /*
    �������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)��
    �������������ſγɼ�(�ܷ�)���������������ſγɼ� (�ܷ�)
    ��װ��һ���ɱ�����ķ���
     */
    public String showScore(String name, double... scores) {

        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }

        return name + " �� " + scores.length + "�ſεĳɼ��ܷ�Ϊ=" + totalScore;
    }
}