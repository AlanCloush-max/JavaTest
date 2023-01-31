package StringTest;

public class chengji {
    public static void main(String[] args) {
        String num1 = "1234565";
        String num2 = "125";
        //设置一个方法将字符串转化为整数
        int[] arr = stringtoInt(num1);

        int x  = arraytoInt(arr);
        int[] arr1 = stringtoInt(num2);
        int y = arraytoInt(arr1);
        int z  = x * y;
        System.out.println(z);



    }

    public static int[] stringtoInt(String num){
       char[] arr =  num.toCharArray();
       int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i] - 48;
        }
        return arr1;



    }

    public static int arraytoInt(int[] arr){
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i] * Math.pow(10,arr.length - 1 -i);
        }

        return  x;
    }
}
