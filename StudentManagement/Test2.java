package StudentManagement;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // 创建一个Username arraylist
        ArrayList<String> usernameList = new ArrayList<>();
        ArrayList<String> passwordList = new ArrayList<>();
        ArrayList<String> idList = new ArrayList<>();
        ArrayList<String> phoneList = new ArrayList<>();
        ArrayList<User> UserList= new ArrayList<>();
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

                    Login(usernameList, UserList);

                    System.out.println("Log in");
                    break;
                case "2":
                    forgotPassword(usernameList, UserList);

                    System.out.println("Forgot password");
                    break;
                case "3":
                    User u = new User();
                    signUp(usernameList, u);
                    passCheck(passwordList, u);
                    nationalIdCheck(idList, u);
                    phoneCheck(phoneList, u);
                    UserList.add(u);
                    System.out.println("注册成功");


                    break;
                case "4":


                    break loop;
                default:
                    System.out.println("No option ");
                    break;
            }
        }


    }

    public static void forgotPassword(ArrayList<String> usernameList, ArrayList<User> UserList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您之前的用户名");
        String newUsername = sc.next();
        if(!containsUserName(newUsername, usernameList)){
            System.out.println("用户名未注册");
            return;

        }
        System.out.println("匹配到用户名，请输入身份证号码");
        String newNationalId = sc.next();
        System.out.println("请输入手机号码");
        String newPhoneNumber = sc.next();
        for (int i = 0; i < UserList.size(); i++) {
            if(newUsername.equals(UserList.get(i).getUserNmae())){
                if(newNationalId.equals(UserList.get(i).getNationalId()) &&
                newPhoneNumber.equals(UserList.get(i).getPhoneNumber())){
                    System.out.println("请输入要修改的密码");
                    UserList.get(i).setPassWord(sc.next());
                    System.out.println("修改成功");
                }else {
                    System.out.println("账号信息不匹配修改失败");
                    break;
                }
            }
        }



    }



    public static void Login(ArrayList<String> usernameList, ArrayList<User> userList){
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String passWord = sc.next();

            if(!containsUserName(userName, usernameList)){
                System.out.println("用户名未注册");
                break;
            }


            String randomCode = randomGen();
            System.out.println("验证码为" + randomCode);
            System.out.println("请输入验证码");
            String checkCode = sc.next();



            if(!codeChecking(checkCode, randomCode)){
                System.out.println("验证码出错");
                continue;
            }

            if(!loginpassCheck(userList, passWord)){
                System.out.println("密码出错");
                continue;
            }

            System.out.println("登录成功");
            break;


        }


    }

    public static void signUp(ArrayList<String> list, User user){
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
                user.setUserNmae(userName);

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

    public static void passCheck(ArrayList<String> list, User user){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入密码");
            String passInput1 = sc.next();
            System.out.println("请重复您的密码");
            String passInput2 = sc.next();
            if (passInput1.equals(passInput2)) {
                list.add(passInput2);

                user.setPassWord(passInput1);

                break;
            }
            System.out.println("两次输入的密码不一致，请重新输入您的密码");
        }

    }

    public static void nationalIdCheck(ArrayList<String> list, User user){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的身分证号码");
            String nationalId = sc.next();
            if(nationalId.length() != 18){
                System.out.println("请输入正确的身份证号码1");
                continue;
            }
            if(nationalId.charAt(0) == '0'){
                System.out.println("请输入正确的身份证号码2");
                continue;
            }

            boolean flag1 = (nationalId.charAt(17) == 'x' || nationalId.charAt(17) == 'X' ||
                    nationalId.charAt(17) >= '0' || nationalId.charAt(17) <= '9');

            if(!flag1){
                System.out.println("请输入正确的身份证号码3");
                continue;
            }
            if(!isallNumber(17, nationalId)){
                System.out.println("请输入正确的身份证号码4");
                continue;
            }
            list.add(nationalId);
            user.setNationalId(nationalId);
            break;

        }


        System.out.println("身份证验证成功");

    }
//
    public static boolean isallNumber(int x, String str) {
        for (int i = 0; i < x; i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;

            }

        }
        return true;

    }

    public static void phoneCheck(ArrayList<String> list, User user){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入电话号码");
            String phoneNumber = sc.next();
            if(phoneNumber.length() != 11){
                System.out.println("电话号码错误，重新输入");
                continue;
            }
            if(!isallNumber(11, phoneNumber)){
                System.out.println("电话号码错误，重新输入");
                continue;
            }

            System.out.println("电话号码验证成功");
            list.add(phoneNumber);
            user.setPhoneNumber(phoneNumber);
            break;
        }
    }


    public static String randomGen(){
        StringBuilder sb = new StringBuilder();
        String base = "wqetryuioplkjhgfdsazxcvbmnABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String base1 = "0123456789";
        Random r = new Random();

        int y = r.nextInt(9);
        for (int i = 0; i < 4; i++) {
            int x = r.nextInt(51);
            sb.append(base.charAt(x));

        }
        sb.append(base1.charAt(y));
        //再把最后一位的数字给打乱插入
        //确定出现在哪一位置，然后互换
        String temp;
        int z = r.nextInt(4);
        temp = sb.substring(z, z+1);
        sb.replace(z, z+1, sb.substring(4,5));
        sb.replace(4, 5, temp);
        String str =sb.substring(0);

        return str;
    }

    public static boolean codeChecking(String checkCode, String randomCode){

        if(checkCode.equals(randomCode)){

            return true;
        }



        return false;
    }

    public static boolean loginpassCheck(ArrayList<User> userList, String passWord){
        for (int i = 0; i < userList.size(); i++) {
            if(passWord.equals(userList.get(i).getPassWord())){
                return  true;
            }
        }
        return  false;

    }





}










