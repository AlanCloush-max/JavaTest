package StringBuilder;

public class stringbuilderdemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //2. 添加字符串
        String s = sb.append("abc").toString();
        System.out.println(s);

    }
}
