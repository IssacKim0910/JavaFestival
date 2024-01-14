package javaFestival;

import java.util.Scanner;

public class ex16 {
    /*
    8자리 정수를 입력받아 반복문을 활용하여 입력받은 정수의 합을 구하여
    출력하는 프로그램을 작성하시오.
    <결과화면>
    25462581 => 2+5+4+6+2+5+8+1 12345678 => 1+2+3+4+5+6+7+8
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
            int n = sc.nextInt();
            int result = n;
            int sum = 0;
            while(result >0) {
                sum += result % 10;
                result = result/10;
            }
            System.out.println("합은 " + sum + "입니다.");


        }
}