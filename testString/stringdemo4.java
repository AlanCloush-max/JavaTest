package testString;

import java.util.Scanner;

public class stringdemo4 {
    public static void main(String[] args){
        //1. 定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";


        //2. 模拟用户登录，键盘录入
        int flag = 0;
        Scanner sc = new Scanner(System.in);




        for( int i = 1; i < 4; i++){

            System.out.println("Please input the username");
            String userName = sc.next();
            System.out.println("Please input the password");
            String passWord = sc.next();

            boolean result1 = userName.equals(rightUsername);
            boolean result2 = passWord.equals(rightPassword);

            if(result1&&result2){
                System.out.println("登录成功");
                flag = 1;
                break;

            } else if (result1 == false) {
                System.out.println("用户名或者密码错误");

            }
        }
        if(flag == 0){
            System.out.println("三次机会已经用完，请重新启动程序");
        } else if (flag == 1) {
            System.out.println("您已经登录，请执行下一步操作");
        }
    }

}
