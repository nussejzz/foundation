package com.dzh.VerifyCode;

public class GeberateUtil {
    //开发一个程序，可以生成指定长度的验证码
    //验证码由数字、大写字母、小写字母组成
    public static String generate(int length) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * str.length());
            sb.append(str.charAt(index));
        }
        return sb.toString();
    }
}
