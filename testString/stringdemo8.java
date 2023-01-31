package testString;

import java.util.Scanner;

public class stringdemo8 {
    public static void main(String[] args){



        System.out.println("相反的为");

        System.out.println(reverse("abc"));

    }

    public static String reverse(String str){
        String str1 = "";
        for (int i = str.length() -1 ; i >= 0; i--) {
            char c = str.charAt(i);
            str1 += c;

        }
        return str1;

    }
}
