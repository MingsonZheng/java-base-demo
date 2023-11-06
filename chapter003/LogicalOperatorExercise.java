// Âß¼­ÔËËã·û
// Á·Ï°
public class LogicalOperatorExercise {
    public static void main(String[] args) {
        
        int x = 5;
        int y = 5;
        if (x++ == 6 & ++y == 6) { // Âß¼­Óë
            x = 11;
        }
        System.out.println("x=" + x + ",y=" + y);// 6 6

        x = 5;
        y = 5;
        if (x++ == 5 || ++y == 5) {
            x = 11;
        }
        System.out.println("x=" + x + ",y=" + y);// 11 5

        boolean a = true;
        boolean b = false;
        short z = 46;
        if ((z++ == 46) && (b = true)) { // T && T
            z++;
        }
        if ((a = false) || (++z == 49)) { // F || T
            z++;
        }
        System.out.println("z=" + z);// 50
        System.out.println(b = true);// T
        System.out.println(a = false);// F
    }
}
