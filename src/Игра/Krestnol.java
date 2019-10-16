package Игра;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by home pc 16.10.19
 *
 */

public class Krestnol {
    private static char[] [] map = new char[3][3]; //игровое поле
    private static Scanner sc = new Scanner(System.in); //сканер для чтения косоли
    private static Random rand = new Random(); // генератор случайных чисел
    private static final int CONSTANT_ONE = 1;

    public static void initMap () { // инициализируем массив
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                map [i][j] = '*';
            }
        }
    }
    public static void printMap() { //выводим игровое поле в консоль
        System.out.println("0 1 2 3"); //первая строка с коорднатами
        for (int i = 0; i < 3; i++) { //печатаем поле
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++)  {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main (String[] args) {
        initMap();//инициализируем поле
        printMap();// печатаем поле
        while (true) {
            humanTurn();//ход человека
            printMap();// печать поля
            if (checkWin('x')) { // проверка победы человека
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) break; //если поле заполнилось завершаем игру
            aiTurn();
            printMap();
            if (checkWin('o')) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over)))");
    }
    private static void humanTurn() { //ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате X и Y");
            x = sc.nextInt() - 1 ;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));//вводит пользователь
        map [y] [x] = 'x'; // ставится х
    }
    public static boolean isCellEmpty (int x, int y) {
        if (x<0||x>2||y<0||y>2) return false;
        if (map[y] [x] !='*') return false;
        return true;
    }
    private static boolean isMapFull () {
        for (int i= 0; i<3; i++) {
            for (int j=0;j<3; j++) {
                if (map[i][j]== '*') return false;
            }
        }
        return true;
    }
    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        }while (!isCellEmpty(x,y));
        map[y] [x] = 'o';
    }
    public static boolean checkWin(char ox){
        // ищем заполненные гориз линии
        if (map[0][0] == ox && map [0][1] == ox && map [0][2] == ox) return true;
        if (map[1][0] == ox && map [1][1] == ox && map [1][2] == ox) return true;
        if (map[2][0] == ox && map [2][1] == ox && map [2][2] == ox) return true;
        //ищем заполненные вертикальные оинии
        if (map[0][0] == ox && map [1][0] == ox && map [2][0] == ox) return true;
        if (map[0][1] == ox && map [1][1] == ox && map [2][1] == ox) return true;
        if (map[0][2] == ox && map [1][2] == ox && map [2][2] == ox) return true;
        //ищем диагонали
        if (map[0][1] == ox && map [1][1] == ox && map [2][2] == ox) return true;
        if (map[2][0] == ox && map [1][1] == ox && map [0][2] == ox) return true;
        return false;
    }
}
