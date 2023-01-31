package testString;

public class stringdemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abC";

        System.out.println(s1 == s2);

        boolean result1 = s1.equalsIgnoreCase(s2);
        System.out.println(result1);
    }
}
