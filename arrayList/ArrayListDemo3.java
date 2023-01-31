package arrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        String str = "";

        //遍历
        str += "[";
        for (int i = 0; i < list.size(); i++) {

            if(i == list.size() -1){
                str += list.get(i);
            }else {
                str += list.get(i);
                str += ", ";
            }

        }
        str += "]";

        System.out.println(str);
    }
}
