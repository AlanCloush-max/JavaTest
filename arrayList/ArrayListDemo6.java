package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //1. 创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2. 键盘输入添加元素
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入年龄");
            s.setAge(sc.nextInt());
            System.out.println("请输入姓名");
            s.setName(sc.next());
            list.add(s);

        }

        //3. 遍历list
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+ "  " + stu.getAge());
        }
    }
}
