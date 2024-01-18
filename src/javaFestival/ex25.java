package javaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class ex25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
        String num = sc.next();
        String[] n = num.split("");     // 입력 받은 숫자를 나눠서 저장해줄 배열 생성

        int count = 0;

        for (int i = 0; i < n.length; i++) {
            switch (n[i]) {                    // 배열에 들어간 값으로 조건문을 실행
                case "0":
                    count += 6;
                    break;
                case "1":
                    count += 2;
                    break;
                case "2":
                    count += 5;
                    break;
                case "3":
                    count += 5;
                    break;
                case "4":
                    count += 4;
                    break;
                case "5":
                    count += 5;
                    break;
                case "6":
                    count += 6;
                    break;
                case "7":
                    count += 3;
                    break;
                case "8":
                    count += 7;
                    break;
                case "9":
                    count += 6;
                    break;

            }
        }
        System.out.print("대시('_')의 총 합 >> " + count);

    }

}
