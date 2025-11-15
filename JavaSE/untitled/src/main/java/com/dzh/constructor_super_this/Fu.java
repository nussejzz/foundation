package com.dzh.constructor_super_this;

public class Fu {
    private int age;

    public Fu() {
        System.out.println("this is father NoArgConstructor");
    }
    public Fu(int age) {
        this.age = age;
        System.out.println("this is father AllArgConstructor");
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Fu{" +
                "age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
