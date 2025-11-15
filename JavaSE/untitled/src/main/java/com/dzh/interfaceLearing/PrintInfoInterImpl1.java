package com.dzh.interfaceLearing;

import java.util.ArrayList;

public class PrintInfoInterImpl1 implements  PrintInfoInter {
    private Student[] allStudent = new Student[10];

    public PrintInfoInterImpl1() {
    }
    public PrintInfoInterImpl1(Student[] allStudent) {
        this.allStudent = allStudent;

    }



    @Override
    public void printAllInfo() {
        for (Student student : allStudent) {
            System.out.println(student);
        }
    }

    @Override
    public void printAverage() {
        int sum = 0;
        for (Student student : allStudent) {
            sum += student.getAge();
        }
        System.out.println("Average age: " + (sum / allStudent.length));

    }
}