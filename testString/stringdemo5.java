package testString;

import java.util.Scanner;

//需求：键盘录入一个字符串，实用程序实现在控制台遍历该字符串
public class stringdemo5 {
    public static void main(String[] args){
        //1. 键盘录入一个字符串并遍历

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str1 = sc.next();

        //2. 进行遍历
        for(int i =0; i < str1.length(); i++){
            char c = str1.charAt(i);
            System.out.println(c);
        }



    }
}
