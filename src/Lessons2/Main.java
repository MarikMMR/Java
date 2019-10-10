package Lessons2;

/**
 * Created 10.10.19 by Home-pc
 */

public class Main {
    public static void main( String args[]) {
        int u=2; // test peremennaya
        if (u>1) {
            System.out.println(true); }
        else {System.out.println(false);}
        if (u>1 && u<5) {System.out.println(true);}// если число больше 1 И меньше 5
        if (u<3 || u>10) {System.out.println(true);} //если число меньше 3 ИЛИ больше 10
    // SWITCH
    switch (u) {
        case 1 :
            System.out.println("u=one");
            break;
        case 2 :
            System.out.println("u-two");
            break;
        case 3 :
            System.out.println("u=three");
            break;
        default:
            System.out.println("u= one,two,three");
    }


    }
}
