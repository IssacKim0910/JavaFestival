package javaFestival;

public class ex21 {
    public static void main(String[] args) {
        int[] point = {92,32,52,9,81,2,68};

        int min = point[0];

        for (int i = 0; i < point.length; i++) {
            if (min>point[i]){
                min = point[i];
            }
        }
        System.out.println(min);
    }

}
