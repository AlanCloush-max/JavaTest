package arrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //1. 创造一个集合
        ArrayList<String> list  = new ArrayList<>();
        //2. 添加一个元素
       list.add("aaa");
       list.add("aaa1");
       list.add("bbb");
       list.add("ccc");

       //3. 删除
       String str = list.remove(0);


       //4. 修改元素

        String str1 = list.set(0,"aaaaa1");
        System.out.println(str1);
        System.out.println(list);


        //5. 查询元素

        String s = list.get(0);
        System.out.println(s);

        //6. 遍历

        for (int i = 0; i < list.size(); i++) {
            String ss = list.get(i);

            System.out.println(ss);
        }

    }
}
