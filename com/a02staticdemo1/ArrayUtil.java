package com.a02staticdemo1;

public class ArrayUtil {

    private ArrayUtil(){}   //私有化构造方法



    //创建一个方法，必须是static的,方便用类名直接调用而不用创建对象

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //i就是索引  arr[i]才是里面的元素
            if(i == arr.length -1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+ ", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }



}
