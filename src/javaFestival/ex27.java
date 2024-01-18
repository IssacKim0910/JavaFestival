package javaFestival;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 채점하기 ====");

        String answer = sc.next();
        String[] result = answer.split("");
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < result.length; i++) {
        switch (result[i]){
            case "o": {
                cnt++;
                sum = sum + cnt;
                break;
            }
            case "x": {
                cnt = 0;
                break;
            }
        }

        }
        System.out.println(sum);

    }
}
