package Chapter_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java01_HelloWorld {
    public static void main(String[] args) {
        String str = "11x1";
        System.out.println(isallNumber(4,str));
    }

    public static boolean containsNumber(String str) {


        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean isLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static int countLetter(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                count ++;
            }
        }
        return count;
    }

    public static boolean isnumchr(String str){
        char[] chr = str.toCharArray();
        int count = 0;

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char x = chr[i];
            boolean flag1 = ( x >= 'a' && x <= 'z');
            boolean flag2 = (x >= 'A' && x <= 'Z');
            boolean flag3 = (x >= '0' && x <= '9');
            boolean flag4 = (flag1 || flag2);
            boolean flag5 = (flag4 || flag3);
            if(flag3){
                count++;
            }

            if(!flag5){
                return false;
            }


        }
        if(count == str.length()){
            return false;
        }else {
            return true;
        }


    }


    public static boolean isallNumber(int x, String str) {
        for (int i = 0; i < x; i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;

            }

        }
        return true;

    }
}


