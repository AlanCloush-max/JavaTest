package StringTest;

import java.util.Scanner;

public class danci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input ");
        String s = "sadasd  sadasd    asdasdasdas    aaa";
        int x = wordLength(s);
        System.out.println(x);
     


    }


    // 首先确定有多少个空格，然后将空格的index返回，然后截取最后空格之后的字符串
    public static int wordLength(String s){
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = arr.length -1 ; i >= 0; i--) {
            if (arr[i] != ' '){
                count += 1;
            }else {
                break;
            }

        }
        return count;

    }
}
