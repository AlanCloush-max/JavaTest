package StringTest;

public class StringAdjustCase3 {
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
        char[] arr = A.toCharArray();


        char temp = arr[0];
        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;


        String str =new String(arr);
        return str;



    }
}
