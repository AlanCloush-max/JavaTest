package testString;

public class stringdemo7 {
    public static void main(String[] args){
        int[] arr = {1,2,3};

        String str = arrToString(arr);
        System.out.println(str);

    }


    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }

        if(arr.length == 0){
            return"[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i< arr.length -1){
                result += arr[i] + ", ";
            }else {
                result += arr[i];
            }


        }
        result += "]";
        return result;
    }
}
