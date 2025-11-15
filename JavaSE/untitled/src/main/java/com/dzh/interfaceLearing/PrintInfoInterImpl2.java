package com.dzh.interfaceLearing;

public class PrintInfoInterImpl2 implements  PrintInfoInter {
    private Student[] allStudent = new Student[10];
    public PrintInfoInterImpl2() {
    }
    public PrintInfoInterImpl2(Student[] allStudent) {
        this.allStudent = allStudent;
    }
    @Override
    public void printAllInfo() {
        int count1 = 0;
        int count2 = 0;
        for (Student student : allStudent) {
            if(student.getGender().equals("male")){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("Number of male students: " + count1);
        System.out.println("Number of female students: " + count2);
    }

    @Override
    public void printAverage() {
        int sum = 0;
        int max = allStudent[0].getAge();
        int min = allStudent[0].getAge();
        for (Student student : allStudent) {
            max = Math.max(max, student.getAge());
            min = Math.min(min, student.getAge());
            sum += student.getAge();
        }
        sum = sum - max - min;
        System.out.println("Average age (excluding max and min): " + (sum / (allStudent.length - 2)));

    }
}
