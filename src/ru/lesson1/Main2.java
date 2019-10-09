package ru.lesson1;

/**
 * Created by Home-pc on 08.10.19
 */
public class Main2 {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a<b) System.out.println("a меньше чем b");
 //эта строка не должна выводится
        if (a==b) System.out.println("это сообщение не будет выведено");
        System.out.println();
        c = b-a ; // Переменная c=1
        System.out.println("с = 1");
        if (c >= 0) System.out.println("c не отрицательно");
        if (c<=0) System.out.println("c отрицательно");
        System.out.println();
        c = a-b; // Переменная c=-1
        System.out.println("с = -1");
        if (c >= 0) System.out.println("c не отрицательно");
        if (c<=0) System.out.println("c отрицательно");


    }
}
