package StringTest;
import java.util.Scanner;
import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(randomGen(sb));




    }

    public static StringBuilder randomGen(StringBuilder sb){
        String base = "wqetryuioplkjhgfdsazxcvbmnABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String base1 = "0123456789";
        Random r = new Random();

        int y = r.nextInt(9);
        for (int i = 0; i < 4; i++) {
            int x = r.nextInt(51);
            sb.append(base.charAt(x));

        }
        sb.append(base1.charAt(y));
        //再把最后一位的数字给打乱插入
        //确定出现在哪一位置，然后互换
        String temp;
        int z = r.nextInt(4);
        temp = sb.substring(z, z+1);
        sb.replace(z, z+1, sb.substring(4,5));
        sb.replace(4, 5, temp);

        return sb;
    }


}
