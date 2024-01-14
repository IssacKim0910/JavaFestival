package javaFestival;

import java.util.Random;

public class ex18 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            array[i] = rand.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }

        }

        for (int i = 0; i < 6; i++) {
            System.out.println(array[i] + " ");
        }

    }
}
