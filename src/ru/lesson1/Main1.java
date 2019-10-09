package ru.lesson1;

/**
 * Created by Home-pc on 8.10.19
 */
public class Main1 {
    public static void main(String args[]) {
            int a;
            int b;
            int c;
            int d;
            a = 128;
            System.out.println("a= " + a);
            b = a/2;
            System.out.println("b = a/2=" + b);
            c = a + b*a;
            System.out.println("c = a + b*a=" + c);
            d = ((a+b)/c)*b;
            System.out.println("d = (( a + b ) / c ) * b=" +d);
        }
}
