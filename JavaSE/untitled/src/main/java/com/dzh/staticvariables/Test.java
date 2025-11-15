package com.dzh.staticvariables;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println( Student.count );
        student2.setage( 18 );
        System.out.println( student2.getage() );
        student2.ifadult();
        String code = VerifyCodeUtil.generateVerifyCode( 4 );
        System.out.println( code );
    }
}
