package javaFestival;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Wage = 5000;

        System.out.print("일한시간을 입력하세요 : ");
        int hour = sc.nextInt();
        int sum = 0;

        if (hour > 8) {
            int over = hour - 8;
            sum = (Wage * 8) + (int)(over * 1.5 * Wage);
        } else {
            sum = hour * Wage;
        }
        System.out.println("총 임금은 " +  sum + "원 입니다.");

    }
}
