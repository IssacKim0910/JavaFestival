package javaFestival;

import java.util.Scanner;

public class ex15 {
    /*
    정수 n을 입력받아
    1, 2, 4, 7, 11 과 같은 수열의
    n번째 항까지 출력하시오.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {
            num = num + i;
            System.out.print(num+" ");
        }

    }
}