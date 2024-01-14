package javaFestival;

public class ex11 {
    public static boolean isDivide(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        boolean result = isDivide(num1, num2);
        System.out.println("결과 확인 : " + result);

    }


}
