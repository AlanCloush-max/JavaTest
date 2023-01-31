package testString;

import java.util.Scanner;

//手机号屏蔽
public class stringdemo10 {
    public static void main(String[] args){
      //1. 获取一个手机号码
        String phoneNumber = "177783196735";

        //2. 截取手机号码前三位
        String start = phoneNumber.substring(0,3);


        //3. 截取手机号码后面四位
        String end = phoneNumber.substring(8,12);

        //4. 将星号和这两个拼接起来
        String modifiedNumber = start + "****" + end;
        System.out.println(modifiedNumber);





    }
}
