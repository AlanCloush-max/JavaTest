package com.a02staticdemo1;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};

        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

    double[] arr2 = {1.1, 1.2, 1.3, 1.4};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }




}
