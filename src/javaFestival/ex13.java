package javaFestival;

public class ex13 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;


        String score = "A,A,B,C,D,A,C,D,D,D,F";

        String[] result = new String[score.length()];
        result = score.split(",");

        for (int i = 0; i < result.length; i++) {
            switch (result[i]) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
                case "D":
                    d++;
                    break;
                case "E":
                    e++;
                    break;
                case "F":
                    f++;
                    break;
            }
        }

        System.out.println("A : "+ a + "명");
        System.out.println("B : "+ b + "명");
        System.out.println("C : "+ c + "명");
        System.out.println("D : "+ d + "명");
        System.out.println("E : "+ e + "명");
        System.out.println("F : "+ f + "명");
    }
}
