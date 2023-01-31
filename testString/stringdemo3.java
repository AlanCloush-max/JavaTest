package testString;

import java.util.Scanner;

public class stringdemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input");
        String str1 = sc.next();
        String str2 = "abc";

        System.out.println(str1 == str2);  // false

        boolean r1 = str1.equals(str2);
        System.out.println(r1);

        //想要比较字符串的内容，因为字符串输入的缘故，要用String 的方法来比较


    }
}
