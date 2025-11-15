package com.dzh.staticvariables;

public class Test2 {
    public static void main(String[] args) {
        //静态方法可以调用静态变量，不能调用实例变量
        Student.sayhello();
        //实例方法可以调用静态变量
        Student stu0 = new Student();
        stu0.setage(20);
        stu0.ifadult();
    }
}
