package javaFestival;

import java.util.Scanner;

public class ex12 {
    /*
    1 6 11 16 21
    2 7 12 17 22
    3 8 13 18 23
    4 9 14 19 24
    5 10 15 20 25 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[j][i] = num;
                num++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }





    }
}
