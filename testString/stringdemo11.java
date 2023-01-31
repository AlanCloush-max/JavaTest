package testString;

import java.util.Scanner;

// 需求：从身份证号分析出个人信息
// 出生年月和性别
public class stringdemo11 {
    public static void main(String[] args){

        //1. 接受一个身份证号码
        String id = "510122200107100298";


        //2. 获取出生年月的数字
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);


        //3. 获取第17位数字并判断男女
//        String gender = "";
//        String genderNumber = id.substring(16,17);
//        int genderNumberInt = Integer.parseInt(genderNumber);
//        if(genderNumberInt % 2 == 0){
//            gender = "female";
//        }else {
//            gender = "male";
//        }
        char gendernum = id.charAt(16);
        int num = gendernum - 48;
        String gender = "";
        if(gendernum % 2 == 0){
            gender = "female";
        }else {
            gender = "male";
        }


        //4. 打印个人信息
        System.out.println("人物信息为：");
        System.out.println("出生年月日: "+ year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + gender);

    }
}
