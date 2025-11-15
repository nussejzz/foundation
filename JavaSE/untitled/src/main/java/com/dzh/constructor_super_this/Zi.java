package com.dzh.constructor_super_this;

public class Zi extends Fu{
    private int score;

    @Override
    public String toString() {
        return "Zi{" +
                "age=" + super.getAge() + ", score=" + score +
                '}';
    }

    public Zi(){
    System.out.println("子类no参构造器");
    }
    public Zi(int score,int age){
        //super(); // 调用父类no参构造器
        super(age);// 调用父类有参构造器'
        this.score = score;
        System.out.println("子类you参构造器");
    }
}
