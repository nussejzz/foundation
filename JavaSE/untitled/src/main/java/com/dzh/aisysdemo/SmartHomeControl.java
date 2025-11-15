package com.dzh.aisysdemo;

public class SmartHomeControl {
//    private JD jd;
//
//    public SmartHomeControl() {
//    }
//    public SmartHomeControl(JD jd) {
//        this.jd = jd;
//    }
    public void control(JD jd) {
            jd.press();
    }
    public void printAllInfo(JD[] jds) {
        for (JD jd : jds) {
            System.out.println("JD name: " + jd.getName() + ", state: " + (jd.isState() ? "开" : "关"));
        }
        System.out.println("--------------------");

    }


}

