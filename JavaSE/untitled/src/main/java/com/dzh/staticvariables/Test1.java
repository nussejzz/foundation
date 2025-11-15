package com.dzh.staticvariables;

public class Test1 {
    public static void main(String[] args) {
        String code = VerifyCodeUtil.generateVerifyCode( 4 );
        System.out.println( code );

    }
}
