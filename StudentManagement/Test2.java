package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // 创建一个Username arraylist
        ArrayList<String> usernameList = new ArrayList<>();
        // 打印最开始的界面
        loop: while (true) {
            System.out.println("--------------欢迎来到学生管理系统--------------");
            System.out.println("1: 登录");
            System.out.println("2: 忘记密码");
            System.out.println("3: 注册");
            System.out.println("4: 退出");
            System.out.println("请输入您的操作: ");

            Scanner sc = new Scanner(System.in);
            String choose1 = sc.next();
            switch(choose1){
                case "1":

                    System.out.println("Log in");
                    break;
                case "2":
                    System.out.println("Forgot password");
                    break;
                case "3":

                    signUp(usernameList);

                    break;
                case "4":


                    break loop;
                default:
                    System.out.println("No option ");
                    break;
            }
        }


    }


    public static void signUp(ArrayList<String> list){
        while (true) {
            Scanner sc  = new Scanner(System.in);
            System.out.println("请输入用户名");
            String userName = sc.next();
            boolean flag = containsUserName(userName, list);
            if(flag){
                System.out.println("用户名重复，请重新输入");
            }
            int userNameLength = userName.length();
            boolean flag1 = (userNameLength < 3 || userNameLength > 15);   // true 小于3大于15
            boolean flag2 = (!isnumchr(userName));                  //不是字母和数字的结合体

            if(flag2 || flag1 || flag){
                System.out.println("用户名不符合规范，请重新输入");
            }else {
                System.out.println("用户名验证成功");
                list.add(userName);
                break;

            }
        }


    }

    // 输入用户的姓名，和姓名的集合中去找有没有重复，有就返回index，没有就返回-1
    public static int getIndex(String name, ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {
            String username = list.get(i);
            if (name.equals(username)){         //传入的是
                return i;
            }
        }
        return -1;

    }

    public static boolean containsUserName(String name, ArrayList<String> list){
        if (getIndex(name, list) == -1){
            return false;
        }
        return true;
    }





    public static boolean isnumchr(String str){
        char[] chr = str.toCharArray();
        int count = 0;

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char x = chr[i];
            boolean flag1 = ( x >= 'a' && x <= 'z');
            boolean flag2 = (x >= 'A' && x <= 'Z');
            boolean flag3 = (x >= '0' && x <= '9');
            boolean flag4 = (flag1 || flag2);
            boolean flag5 = (flag4 || flag3);
            if(flag3){
                count++;
            }

            if(!flag5){
                return false;
            }


        }
        if(count == str.length()){
            return false;
        }else {
            return true;
        }


    }

}



