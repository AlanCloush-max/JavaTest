package StringTest;

import java.util.Scanner;

public class danci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input ");
        String s = "fly me to the   moon";
        int x = wordLength(s);
        System.out.println(x);



    }


    // 首先确定有多少个空格，然后将空格的index返回，然后截取最后空格之后的字符串
    public static int wordLength(String s){
        int x = s.lastIndexOf('n');
       return x;

    }
}
