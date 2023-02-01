package arrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();  //不能用int ，要用interger


        //2. 添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //3. 遍历集合
        System.out.print("[");

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() -1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");

            }
        }
        System.out.println("]");


    }
}
