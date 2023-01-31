package StringBuilder;
// 把数组编程为字符串
public class stringbuilderdemo4 {
    public static void main(String[] args) {
        //1. 定义数组
        int[] arr = {1,2,3};

        //2. 调用方法把数组编程字符串

        String str = arrtoString(arr);
        System.out.println(str);




    }

    public static String arrtoString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                sb.append(arr[i]);
                sb.append(", ");
            }else {
                sb.append(arr[i]);
                sb.append("]");
            }

        }

        return sb.toString();


    }
}
