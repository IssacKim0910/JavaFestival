package javaFestival;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];          // 10번 출력을위해
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + "번째 정수 입력>>");
            array[i] = sc.nextInt();                //배열에 값 저장
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0){                 // 3의 배수만 출력하는데
                if(array[i] == 0) continue;     //0 이면 출력하지 않음
                System.out.print(array[i] + " ");
            }


        }


    }
    }

