package StringTest;

import java.util.Scanner;

public class luomashuziCase1 {
    public static void main(String[] args) {
        String str;


        while(true){
            //1. 键盘录入一个字符串
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the String");
            str = sc.next();

            //2. 校验字符串是不是数字
            boolean flag = checkStr(str);
            if(flag == true ){
                break;
            }else{
                System.out.println("当前的输入有误");
            }
        }

        //3. 将内容变成罗马数字
        String result = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int x = c - 48;
            sb.append(" ");
            sb.append(changeLuoma(x));
        }
        result = sb.toString();
        System.out.println(result);








    }

    public static boolean checkStr(String str){               // 检查传入的String,其中没有数字返回true，其余返回false
        //要求1：长度小于等于9
        if(str.length() > 9){
            return  false;
        }

        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if( c < '0' || c > '9' ){
                return false;
            }
        }
        return true;
    }

    public static String changeLuoma(int number){
        //定义一个数组
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};


        return arr[number];
    }

}
