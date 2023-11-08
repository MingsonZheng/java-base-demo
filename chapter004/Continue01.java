// Continue
public class Continue01 {
    public static void main(String[] args) {
        
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("i=" + i);
        }

        System.out.println("=======================");

        label1:
        for (int j = 0; j < 2; j++) {
            label2:
            for (i = 0; i < 5; i++) {
                if (i == 2) {
                    continue;// µÈ¼ÛÓÚ continue label2
                }
                System.out.println("i = " + i);
            }
        }

        System.out.println("=======================");

        label1:
        for (int j = 0; j < 2; j++) {
            label2:
            for (i = 0; i < 5; i++) {
                if (i == 2) {
                    continue label1;
                }
                System.out.println("i = " + i);
            }
        }
    }
}
