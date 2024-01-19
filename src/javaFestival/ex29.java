package javaFestival;

import java.util.Random;
import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int fail=0;

        while(true){
            int a = rd.nextInt(10);
            int b = rd.nextInt(10);
            System.out.print(a + "+" + b + "=");
            int answer = sc.nextInt();
            if (a + b == answer){
                System.out.println("SUCCESS");
            } else {
                System.out.println("Fail...");
                fail ++;
            }
            if(fail == 5){
                System.out.println("GAME OVER!");
                break;
            }
        }


    }
}
