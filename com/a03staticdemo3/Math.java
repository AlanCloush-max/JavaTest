package com.a03staticdemo3;

import java.util.ArrayList;

public class Math {


    public static int getMaxAge(ArrayList<Student> studentList){
        int max = 0;

        for (int i = 0; i < studentList.size(); i++) {
            int tempAge = studentList.get(i).getAge();
            if(tempAge > max){
                max = tempAge;
            }
        }
        return max;
    }
}
