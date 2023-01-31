package StringTest;

public class StringAdjustCase2 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "bcdea";
        int i = 0;
        String result = "";
        while(i < A.length()){
            result = shift(A);
            if(result.equals(B)){
                System.out.println("True");
                break;
            }
            i++;
        }
        if(result.equals(B) == false){
            System.out.println("False");
        }







    }
    public static String shift(String A){
        char first = A.charAt(0);
        String end = A.substring(1);
        return end + first;


    }
}
