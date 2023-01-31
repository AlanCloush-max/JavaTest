package StringBuilder;

public class stringbuilderDemo1 {
    public static void main(String[] args){
        //1. 创建StringBuilder 对象
        StringBuilder sb = new StringBuilder("abc");

        //2. 添加元素
        sb.append("a");

        //3. 用String 接受 toString的值
        String result = sb.toString();
        System.out.println(result);

        //4. 反转元素
        sb.reverse();
        String result_r = sb.toString();
        System.out.println(result_r);


        //5. 统计字符串个数
        int count = sb.length();
        System.out.println(count);

    }
}
