package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1. 创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2. 添加元素
        sj.add("123").add("aaa").add("ccc");

        //3.
        System.out.println(sj.toString());
    }
}
