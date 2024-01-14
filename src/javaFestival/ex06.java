package javaFestival;
public class ex06 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 77;
        for (int i = 1; i <= 77; i++) {
            sum += (j*i);
            j--;
        }
        System.out.println(sum);
    }
}
