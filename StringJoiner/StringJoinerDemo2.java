package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1. 创建对象
        StringJoiner sj = new StringJoiner("--", "[", "]");
        sj.add("aaaa").add("000").add("dasd");
        System.out.println(sj);

    }
}
