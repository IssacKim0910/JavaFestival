package javaFestival;

import java.util.Scanner;

public class bonus05 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "번째 수 입력 : ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


}
