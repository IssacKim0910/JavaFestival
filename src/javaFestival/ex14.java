package javaFestival;

import java.util.Scanner;

/*
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25 출력
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int num = 1;

        for (int i = 0; i< array.length; i++){
            if(i % 2 == 0){
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = num;
                    num++;
                }
            }
            else {
                for (int j = array[i].length-1; j >= 0; j--) {
                    array[i][j] = num;
                    num++;
                }
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
