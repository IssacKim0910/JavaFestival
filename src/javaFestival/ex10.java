package javaFestival;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[8];



        System.out.print("배열에 있는 모든 값 : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100);        //100까지 난수만들기
            System.out.print(array[i]+" ");
        }
        int max = array[0];                                 //최댓값 임의 지정
        int min = array[0];                                 //최솟값 임의 지정


        for (int j = 1; j< array.length; j++){
            if(max < array[j]){
                max = array[j];                             //최댓값 변경
            }
            if (min > array[j]){
                min = array[j];                             //최솟값 변경
            }
        }

        System.out.println();
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);

    }
}
