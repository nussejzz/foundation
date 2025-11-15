package com.dzh.VerifyCode;

public class Test {
    public static void main(String[] args) {
        String code = GeberateUtil.generate(4);
        String code2 = GeberateUtil.generate(1);
        int count = 0;
        while(!code2.equals("Z")){
            code2 = GeberateUtil.generate(1);
            count++;
        }
        System.out.println(count);
    }

}
