package javaFestival;

public class bonus02 {
    public static String getMiddle(String word){
        int length = word.length();
        int index = length / 2;
        if(length % 2==0){
            return word.substring(index-1,index+1);     //짝수일때는 가운데와 그 다음까지
        }else{
            return word.substring(index);      //홀수일때는 가운데만 substring(0,1)은 1번째전까지만출력
        }

    }
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));

    }
}
