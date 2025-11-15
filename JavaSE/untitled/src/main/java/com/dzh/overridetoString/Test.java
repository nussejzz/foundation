package com.dzh.overridetoString;

public class Test {
    public static void main(String[] args) {
        //override 重写 scene
        //print object info instead of toString address
        //toString method is defined in Object class
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(20);
        System.out.println(student.toString());
        System.out.println(student);//automatically call toString method

    }
}
