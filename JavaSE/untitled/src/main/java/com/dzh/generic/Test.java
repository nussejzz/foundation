package com.dzh.generic;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // quickstart泛型类advantage
//        ArrayList list = new ArrayList();
//        list.add("hello");
//        list.add(123); // 这里可以添加不同类型的数据
//        list.add('a');
//        list.add(true);
//        list.add(99.99);
//        for (Object obj : list) {
//            // 这里需要进行类型判断和转换，容易出错
//            if (obj instanceof String) {
//                String str = (String) obj;
//                System.out.println("String: " + str);
//            } else if (obj instanceof Integer) {
//                Integer integer = (Integer) obj;
//                System.out.println("Integer: " + integer);
//            } else if (obj instanceof Character) {
//                Character character = (Character) obj;
//                System.out.println("Character: " + character);
//            }
//        涉及到类型转换，容易出错，因此使用泛型，可以在编译前进行类型约束，避免运行时错误

        // 使用泛型类
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        // list.add(123); // 编译错误，不能添加不同类型的数据
        for (String str : list) {
            System.out.println("String: " + str );
        }
    }
}
