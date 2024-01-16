package javaFestival;

public class ex21 {
    public static void main(String[] args) {
        int[] point = {92, 32, 52, 9, 81, 2, 68};       //두수의 거리를 비교 후 거리가 가장 인덱스 출력

        int min = Math.abs(point[0] - point[1]);            //절댓값 함수 사용
        int a = 0;
        int b = 0;
        for (int i = 0; i < point.length; i++) {
            for (int j = i+1; j < point.length; j++) {
                    if (min > Math.abs(point[i] - point[j])) {
                        min = Math.abs(point[i] - point[j]);
                        a = i;
                        b = j;
                    }
                }
            }
        System.out.println("result = ["+ a+","+b+"]");
    }
}

