package javaFestival;

public class bonus03 {

    public static int cal(int a, int b, char op) {

        switch (op) {
            case '+' : {
                return a + b;
            }
            case '-' : {
                return a - b;
            }
            case '*' : {
                return a * b;
            }
            case '/' : {
                return a / b;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 15;
        char op = '*';

        System.out.println(cal(num1, num2, op));
    }

}
