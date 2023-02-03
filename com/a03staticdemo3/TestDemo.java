package com.a03staticdemo3;

import java.util.ArrayList;

//定义一个集合，储存3个学生对象，学生类的属性是name，age，gender
// 定义一个工具类，用于获取集合中最大学生的年龄
public class TestDemo {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("alan", 18, "male");
        Student s2 = new Student("Bob", 17, "male");
        Student s3 = new Student("Carrot", 19, "female");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        int maxAge = Math.getMaxAge(studentList);
        System.out.println(maxAge);

    }




}
