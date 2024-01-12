package javaFestival;
public class ex06 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int j = 0;
        for (i = 1; i <= 77; i++) {
            for (j = 1; j <= i; j++)
                sum += i * j;
        }
        System.out.println(sum);
    }
}
