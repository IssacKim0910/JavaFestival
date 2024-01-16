package javaFestival;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N 입력 >>");
        int n = sc.nextInt();
        System.out.print("X 입력 >>");
        int x = sc.nextInt();

        int[] n2 = new int[n];
        int num = 0;
        //출력문
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 정수 입력>>");
            num = sc.nextInt();
            if (num < x) {
                n2[i] = num;
            }

        }

        for (int i = 0; i < n; i++) {
            if(n2[i] != 0)
            System.out.print(n2[i]);

        }
    }
}
