package com.dzh.javabean;

public class Tset {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Tom");
        student1.setChinese(100);
        student1.setMath(150);

        System.out.println(student1.getName());
        System.out.println(student1.getChinese());
        System.out.println(student1.getMath());

        StudentService service1 = new StudentService(/*student1*/);
        service1.printScore(student1);
        service1.printAverageScore(student1);

    }
}
