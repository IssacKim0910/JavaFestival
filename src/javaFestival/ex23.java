package javaFestival;

public class ex23 {
    public static void main(String[] args) {
       int[][] array = new int[5][5];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num;
                num++;
            }
        }

        //출력문
        System.out.print("원본");
        for (int i = 0; i < array.length ; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
        num = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >=0 ; j--) {
                array[j][i] = num;          //j는 4행부터 시작해서 위로 올라오기때문에 줄어들게
                num++;
            }
        }


        //출력문
        System.out.println();
        System.out.println();
        System.out.print("90도 회전");
        for (int i = 0; i < array.length ; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
