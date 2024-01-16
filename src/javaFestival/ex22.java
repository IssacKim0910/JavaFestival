package javaFestival;

public class ex22 {
    public static void main(String[] args) {

        for (int i = 5; i >0 ; i--) {
            for (int j = 1; j <= i; j++) {      //공백만드는 반복문 아래로 갈수록 공백이 줄어들기때문에 마이너스
                System.out.print(" ");

            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
