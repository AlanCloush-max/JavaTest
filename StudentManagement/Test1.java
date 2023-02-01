package StudentManagement;

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("--------------欢迎来到学生管理系统--------------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("6: 展示所有的学生");
            System.out.println("请输入您的选择: ");

            // 创建一个集合


            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose){
                case "1" :
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("没有这个选项");
                    break;


            }





        }

    }


    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        String ID = null;
        System.out.println("添加学生");
        while (true) {
            System.out.println("请输入学生ID");
            ID = sc.next();
            s.setId(ID);
            int flag = containsID(ID, list);
            if(flag == -1){
                list.add(s);

                break;
            }else {
                System.out.println("添加失败");

            }
        }

        System.out.println("请输入学生姓名");
        s.setName(sc.next());
        System.out.println("请输入学生年龄");
        s.setAge(sc.nextInt());
        System.out.println("请输入学生地址");
        s.setAddress(sc.next());


        System.out.println("添加学生成功！");







    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id");
        String ID = sc.next();
        int index = containsID(ID, list);
        if(index == -1){
            System.out.println("不存在，删除失败");
        }else {
            list.remove(index);
            System.out.println("删除id " + ID);

        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);

        System.out.println("修改学生");
        System.out.println("请输入想要修改的学生的ID");
        String id = sc.next();
        int index = containsID(id, list);
        if(index == -1){
            System.out.println("id不存在，请重新开始");
        }else{
            Student s = list.get(index);

            System.out.println("请输入学生姓名");
            String newName = sc.next();
            s.setName(newName);
            System.out.println("请输入学生年龄");
            s.setAge(sc.nextInt());
            System.out.println("请输入学生地址");
            s.setAddress(sc.next());

            System.out.println("修改成功");
        }


    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if (list.size() == 0){
            System.out.println("当前没有学生信息，请添加");
            return;

        }
        System.out.println("id" +" " + "姓名 " + "年龄 " + "家庭住址");

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+ "  " + stu.getName()+ " "
                    + stu.getAge() + " " + stu.getAddress());
        }
    }

    // 判断id在集合中是否存在，存在返回id的index，不存在返回-1
    public static int containsID(String id, ArrayList<Student> list){

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)){
                return i;
            }
        }
        return -1;

    }



}
