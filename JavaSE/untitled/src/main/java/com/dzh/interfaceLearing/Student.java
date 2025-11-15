package com.dzh.interfaceLearing;

public class Student {
    private String name;
    private String gender;
    private int age;

    public Student(String name, String gender ,int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public Student() {}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
