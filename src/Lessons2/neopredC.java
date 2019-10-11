package Lessons2;

/**
 * 11/10
 *
 */

public class neopredC {
    public static void main(String[] args) {
        //Неопредленный цикл
        int r = 1;
        // Переменная
        while (r < 10) {
            //выполняется цикл пока р меньше 10
            r++;
            System.out.println(r);
        }
        r = 20;
        while (true) {
            // бесконечный цыкл без внутреннего оператора
            r++;
            if (r > 40) {
                System.out.println("stop");
                break;
                // r>40 выходим из цикла
            }
            System.out.print(r + " ");
        }
    }
}