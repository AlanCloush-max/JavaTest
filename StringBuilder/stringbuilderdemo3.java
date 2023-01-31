package StringBuilder;

import java.util.Scanner;

public class stringbuilderdemo3 {
    public static void main(String[] args) {
        //1. 对称
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the string");
        String str = sc.next();
        String str_reverse = sb.append(str).reverse().toString();
        System.out.println(str);
        System.out.println(str_reverse);

        //3. 比较反转后的字符串与原来的字符串，使用equals()函数
        if(str.equals(str_reverse)){
            System.out.println("是对称字符");
        }else{
            System.out.println("不是对称字符");
        }
    }
}
