package javaFestival;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        if (num % 10 < 5) {
            num = num - (num % 10);
        } else {
            num = (num + 10) - (num % 10);
        }

        System.out.print("반올림 수 : " + num);


    }
}