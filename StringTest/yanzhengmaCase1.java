package StringTest;
import java.util.Random;

public class yanzhengmaCase1 {
    public static void main(String[] args) {
        System.out.println(randomGen());





    }

    public static String randomGen(){
        String base1 = "wqetryuioplkjhgfdsazxcvbmnABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String base2 = "0123456789";
        Random r = new Random();
        String str = "";
        int x;
        int y;
        int z;
        for (int i = 0; i < 4; i++) {
            x = r.nextInt(51);
            str += base1.charAt(x);
        }
        y = r.nextInt(9);
        str += base2.charAt(y);
        char[] arr = str.toCharArray();
        z = r.nextInt(4);
        char temp = arr[z];
        arr[z] = arr[4];
        arr[4] = temp;
        String str1  =new String(arr);

        return str1;


    }


}
