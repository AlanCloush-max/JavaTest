package StringTest;

public class StringAdjust {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        String B = "cdecab";
        int i = 0;
        String result = "";
        while(i < 20){
            result = shift(sb);
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
    public static String shift(StringBuilder sb){
        String left = sb.substring(0,1);
        sb.delete(0,1);
        sb.append(left);
        return sb.toString();






    }
}
