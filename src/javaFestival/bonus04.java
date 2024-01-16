package javaFestival;

import java.util.Scanner;

public class bonus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+"번째 별의 수 : ");
            num = sc.nextInt();
            array[i] = num;

        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+":");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        }

    }

