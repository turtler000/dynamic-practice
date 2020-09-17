package com.turtler000.dynamicpractice.course;

import static com.turtler000.dynamicpractice.course.Constant.timeLengh;

/**
 * create by hanhuanyu ON 2020/9/15
 */
public class Teacher{
    String name;
    int[] time = new int[timeLengh];

    public void teach(Student[] students,int[] time,int classSort) {
        for(Student student:students){
            student.learn(time,classSort);
        }
    }
}
