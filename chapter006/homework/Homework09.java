// ��ҵ
public class Homework09 {
    public static void main(String[] args) {
        
        Music music = new Music("Ц������", 300);
        music.play();
    }
}

/*
 ����Music�࣬������������name������ʱ��times����
 ���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
 */
class Music {

    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("����" + name + " ���ڲ�����... ʱ��Ϊ" + times + "��");
    }
}