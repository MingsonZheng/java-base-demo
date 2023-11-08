// For
public class For01 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("hello, world" + i);
        }

        int i = 1;
        for ( ; i < 10; ) {
            System.out.println("hello, world" + i);
            i++;
        }

        // int j = 1;
        // for ( ; ; ) {// ËÀÑ­»·
        //     System.out.println("ok~" + (j++));
        // }

        int count = 3;
        for (int k = 0, j = 0; k < count; k++, j+=2) {
            System.out.println("k=" + k + "j=" + j);
        }
    }
}
