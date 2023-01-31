package Chapter_02;
import java.util.Random;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class VariableTest {
    public static void main(String[] args) {

        int[] arr = createNumber();
        int[] arr1 = userInput();
        // 判断用户的中奖情况
        int redCount = 0;
        int blueCount = 0;
        //判断红球中奖情况
        for (int i = 0; i < arr.length -1 ; i++) {

            for (int j = 0; j < arr1.length -1 ; j++) {
                if(arr1[j] == arr[i] ){
                    redCount++;
                }

            }
        }

        //判断蓝球中奖情况
        if(arr1[6] == arr[6]){
            blueCount = 1;
        }

        // 输出奖励





    }

    public static boolean contains(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }

        }
        return false;
    }

    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }


        }
        //生成蓝色号码
        int blueNumber = r.nextInt(16) + 1;
        arr[6] = blueNumber;
        return arr;

    }

    public static int[] userInput() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <6 ;) {
            System.out.println("请输入第" + (i+1) + "个红球号码");
            int redNumber = sc.nextInt();
            if(redNumber >=1 && redNumber <=33){
                boolean flag = contains(arr, redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("红球存在");
                }


            }else{
                System.out.println("当前红球号码超出范围");

            }


            ;

        }
        while(true){
            System.out.println("请输入篮球号码");
            int blueNumber = sc.nextInt();
            if(blueNumber >=1 && blueNumber <=16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else{
                System.out.println("当前超出");
            }

        }

        return arr;



    }
}









