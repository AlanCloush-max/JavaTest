package StringTest;

import java.util.Scanner;
import java.util.Random;

public class StringRandom {
    public static void main(String[] args) {

        //1. 键盘接受字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("please input String");
        String str = sc.next();

        //2. 打乱内容
        String result = rotate(str);
        System.out.println(result);




    }

    public static String rotate(String str){
        Random r = new Random();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }

        String result = new String(arr);
        return result;


    }
}
