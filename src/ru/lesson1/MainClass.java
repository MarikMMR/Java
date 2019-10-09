package ru.lesson1;

/**
 * @author Home-pc
 * Created by home-pc on 7.10.19.
 */
public class MainClass {
    /**
     *see
     * @param arg
     */
    public static void main(String[] arg)  {
        //comment
        /*kghkgckg
        hgcfccf
         */
        System.out.println("java1");

        int i = 10, j= 2;
        boolean b = true;
        boolean f;
        f= false;
        char c = 'g';
        float h = 1.3f;
        long l=1L;

        i= i +j;
        i += j;

        i = 10;
        System.out.println(i++);
        System.out.println(i);
        i=10;
        System.out.println(++i);

        i = summ(2,6);
        System.out.println(i);
        printSomeText();
        printMyText("sdhjhvsjdgcvsgcvshgdcdsschvsdkgcvdcdsv");
    }

    public static int summ (int a, int b) {
       return a + b;
    }
    public static void printSomeText () {
        System.out.println("Hello!!!");
    }
    public static void printMyText (String txtToPrint) {
        System.out.println(txtToPrint);
    }
}
