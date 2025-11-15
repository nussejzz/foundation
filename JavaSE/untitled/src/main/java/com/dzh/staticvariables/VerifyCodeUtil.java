package com.dzh.staticvariables;

public class VerifyCodeUtil {
    public static String generateVerifyCode(int length) {
        String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int size = base.length();
        StringBuilder verifyCode = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * size);
            verifyCode.append(base.charAt(index));
        }
        return verifyCode.toString();
    }


}
