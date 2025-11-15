package com.dzh.javabean;

public class StudentService {

//    private Student student;
//
//    public StudentService(Student student) {
//        this.student = student;
//    }

//1.print all score
    public void printScore(Student student) {
        System.out.println(student.getChinese() + student.getMath());
    }
//2.prin average score
    public void printAverageScore(Student student) {
        System.out.println((student.getChinese() + student.getMath())/2);
    }
}
