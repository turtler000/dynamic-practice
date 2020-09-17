package com.turtler000.dynamicpractice.course;

import static com.turtler000.dynamicpractice.course.Constant.timeLengh;

/**
 * create by hanhuanyu ON 2020/9/15
 */
public class Student {
    String name;
    int syn = 0;
    int[] time = new int[timeLengh];

    void learn(int[] time, int classSort) {
        if (this.syn == 0) {
            for (int i = 0; i < time.length; i++) {
                if( this.time[i]==0){
                    this.time[i] = classSort;
                    System.out.println("我是学生"+this.name+",我在"+time[0]+"到"+time[time.length-1]+"上"+classSort);
                }
            }
        }
    }
}
