package Lessons2;


import java.util.Arrays;

/**
 * Created 14.10.19 by home pc
 *
 */

public class Massiv {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = {1, 2, 3, 4, 5};
   //     System.out.println((Arrays.toString(arr2)));
   //     for (int i = 0; i<arr2. length; i++) {
   //         System.out.print(arr2[ i ]  + "  ");
    //    }
    //    for (int i : arr2) {
    //        System.out.print(i+ " ");
    //    }
        int w = arr1.length;
        int [][] arr3 = new int [3] [3];
        int [][] arr4 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println((Arrays.deepToString(arr4)));

    }
}
