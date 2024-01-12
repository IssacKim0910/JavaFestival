package javaFestival;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재몸무게 : ");
        int weight = sc.nextInt();
        System.out.print("목표몸무게 : ");
        int goal = sc.nextInt();
        int cnt=1;
        while (true) {
            System.out.print(cnt+"주차 감량 몸무게 : ");
            int diet = sc.nextInt();
            weight -= diet;
            cnt++;

            if (weight <= goal){
                System.out.println(weight + "kg 달성!! 축하합니다!");
                break;
            }
        }


    }

    }


