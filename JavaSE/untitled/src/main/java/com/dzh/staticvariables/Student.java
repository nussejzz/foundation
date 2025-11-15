package com.dzh.staticvariables;

public class Student {

    private String name;
    private int age;
    public static int count = 0;
    public Student() {
        count ++;
    }
    public String getname() {
        return this.name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return this.age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public void ifadult(){
        if(this.age < 18){
            System.out.println("so young so simple");
        }
        else{
            System.out.println("man! What can I say");
            System.out.println("count = " + count);
        }
    }
    public static void sayhello(){
        System.out.println("hello, I am a static method");
        System.out.println(count);
    }


}
