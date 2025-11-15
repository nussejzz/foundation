package com.dzh.aisysdemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        JD jds[] = new JD[4];
        jds[0] = new Lamp("Philips", true);
        jds[1] = new TV("Samsung", false);
        jds[2] = new Air("Daikin", true);
        jds[3] = new WashingMachine("LG", false);

        SmartHomeControl smartHomeControl = new SmartHomeControl();
        //smartHomeControl.control(jds[0]);
        while (true) {
            smartHomeControl.printAllInfo(jds);
            System.out.println("choose one to control:");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "0":
                    smartHomeControl.control(jds[0]);
                    break;
                case "1":
                    smartHomeControl.control(jds[1]);
                    break;
                case "2":
                    smartHomeControl.control(jds[2]);
                    break;
                case "3":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("invalid input");
            }
        }




    }
}
