package testString;

public class stringdemo {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c', 'd'};
        String st4 = new String(chs);
        System.out.println(st4);

        byte[] bytes = {97, 98, 99, 100};
        String st5 = new String(bytes);
        System.out.println(st5);
    }


}
