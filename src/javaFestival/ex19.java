package javaFestival;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("어느 수 까지 출력 : ");
        int num2 = sc.nextInt();

        for (int i = 1; i <= num2; i++) {
            System.out.println(num1 + "*" + i + "=" + num1 * i);
        }
            
    }
}
