package com.a01staticdemo1;

public class Student {
    private String name;
    private String ID;

    private String ClassNumber;

    public static  String teacherName;

    public Student() {
    }

    public Student(String name, String ID, String classNumber) {
        this.name = name;
        this.ID = ID;
        ClassNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getClassNumber() {
        return ClassNumber;
    }

    public void setClassNumber(String classNumber) {
        ClassNumber = classNumber;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }
}
