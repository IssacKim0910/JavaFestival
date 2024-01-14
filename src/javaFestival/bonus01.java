package javaFestival;

import java.util.Scanner;

public class bonus01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("A 입력 >> ");
            int a = sc.nextInt();
            System.out.print("B 입력 >> ");
            int b = sc.nextInt();

            int result = a - b;
            if (a == 0 && b == 0) {
                break;
            }
            System.out.print("결과>> " + result);
            System.out.println();

        }
    }
}