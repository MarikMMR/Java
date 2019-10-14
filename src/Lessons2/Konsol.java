package Lessons2;

import java.util.Scanner;

/**
 * Created by home pc 14.10.19
 *
 */

public class Konsol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String b = sc.nextLine();
        System.out.println(" Ввод строки: " +b);
        System.out.println("---------------");
        System.out.println(" Введите целое число");
        int a =sc.nextInt();
        System.out.println(" Вы ввели число:  " +a);
        System.out.println("---------------");
        System.out.println(" Введите слово");
        String c = sc.next();
        System.out.println("c: " +c);
        System.out.println("------------");
    }
}
