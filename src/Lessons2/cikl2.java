package Lessons2;

/**
 * Created by home pc 11.10.19
 */

public class cikl2 {
    public static void main (String args[]) {
        int a= 0;
        for (;;) {
            a++;
            if (a==5) {
            continue;
            }
            if (a==15) {
            break;
            }
            System.out.println ("a= " +a);
        }
    }
}
