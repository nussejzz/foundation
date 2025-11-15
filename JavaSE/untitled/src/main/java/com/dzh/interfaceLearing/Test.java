package com.dzh.interfaceLearing;

public class Test {
    //target:learn interface,features,usage
    public static void main(String[] args) {
        Student[] allStudent = new Student[10];
        allStudent[0] = new Student("zhangsan", "male",18);
        allStudent[1] = new Student("lisi", "female",19);
        allStudent[2] = new Student("wangwu", "male",20);
        allStudent[3] = new Student("zhaoliu", "female",21);
        allStudent[4] = new Student("tianqi", "male",22);
        allStudent[5] = new Student("sunba", "female",23);
        allStudent[6] = new Student("zhaojiu", "male",24);
        allStudent[7] = new Student("qianer", "female",25);
        allStudent[8] = new Student("zhouyi", "male",26);
        allStudent[9] = new Student("wuqi", "female",27);


        PrintInfoInterImpl1 printInfoInter = new PrintInfoInterImpl1(allStudent);
        printInfoInter.printAllInfo();
        printInfoInter.printAverage();
        PrintInfoInterImpl2 printInfoInter2 = new PrintInfoInterImpl2(allStudent);
        printInfoInter2.printAllInfo();
        printInfoInter2.printAverage();
    }
}
