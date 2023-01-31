package testString;

import java.util.Scanner;
// 要求： 将输入的数字按照发票的格式打印出来，例如1234变成
//零佰零拾零万壹仟貳佰叁拾肆元
public class stringdemo9 {
    public static void main(String[] args){
        //1. 键盘录入金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("Please input the number");
            money = sc.nextInt();
            if(money >=0 && money <= 9999999){
                break;

            }else {
                System.out.println("金额无效");
            }
        }


        // 定义一个字符串，存储数字转变为大写数字的结果
        String moneyStr = "";

        //定义一个变量，储存数字的个数
        int numberCount = 0;

        //2. 得到money 里面的每一个数字
        while(true){
            //从右往左获取数据
            int ge = money % 10;
            numberCount += 1;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr += capitalNumber;

            //去掉刚刚获取的数据
            money = money / 10;

            // 如果数字上的每一位全部获取到，那么money记录到的就是0，循环结束
            if(money == 0){
                break;
            }

        }

        //3. 判断数字有没有7位，没有七位就要在前面补上0
        if(numberCount < 7){

            for (int i = 0; i < 7 - numberCount; i++) {
                moneyStr += "零";
            }
            moneyStr = reverse(moneyStr);
        }



        //4. 插入单位
        //定义一个数组表示单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";

        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];

        }
        System.out.println(result);





    }

    // 定义一个方法，将输入的数字变成大写汉字
    public static String getCapitalNumber(int number){
        //定义数组，让数字和大写的中文产生关联
        String[] arr = {"零","壹","貳","叁","肆","伍","陸","柒","捌","玖"};
        return arr[number];



    }

    // 将一个字符串反向，并返回为一个新的字符串
    public static String reverse(String str){
        String str1 = "";
        for (int i = str.length() -1 ; i >= 0; i--) {
            char c = str.charAt(i);
            str1 += c;
        }
        return str1;
    }
}
