package testString;
// 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符， 数字字符出现的次数。

import java.util.Scanner;

public class stringdemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        String str1 = sc.next();

        //2. 计数器思想,定义三个变量

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            System.out.println(c);
            if(c >= 'a'  && c <= 'z'){
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            } else if (c >= '0' && c <= '9'){
                numberCount++;

            }

        }

        System.out.println("大写字母个数: " + bigCount);
        System.out.println("小写字母个数： " + smallCount);
        System.out.println("数字个数：" + numberCount);


    }
}
