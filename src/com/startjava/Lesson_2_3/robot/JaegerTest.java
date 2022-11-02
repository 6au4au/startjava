package com.startjava.lesson_2_3.robot;


public class JaegerTest {

    public static void main(String[] args) {
        Jaeger bot1 = new Jaeger();
        bot1.setModel("Striker Eureka");
        bot1.setMark("Mark-5");
        bot1.setHeight(76.2f);
        bot1.setWeight(1.850f);
        bot1.setSpeed(10);
        bot1.setStrength(10);
        bot1.setArmor(9);
        Jaeger bot2 = new Jaeger("Horizon Brave", "Mark-1");
        System.out.println(bot1.getModel() + " INFO");
        System.out.println(bot1.getModel() + " Mark: " + bot1.getMark() + " Armor: " + bot1.getArmor());
        System.out.println(bot2.getModel() + " INFO");
        System.out.println(bot2.getModel() + " Mark:" + bot2.getMark() + " Armor: " + bot2.getArmor());
        bot1.move();
        bot1.jump();
        bot2.attack();
        bot2.drift();
        bot2.setModel("Unknown Jaeger");
        System.out.println(bot2.getModel());
    }
}