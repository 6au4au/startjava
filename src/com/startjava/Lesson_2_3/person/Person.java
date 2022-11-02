package com.startjava.lesson_2_3.person;


class Person {
    String name = "John";
    char gender = 'M';
    int age = 23;
    float weight = 88.6f;
    float height = 1.82f;
    int speed;
    boolean movement;

    void stay() {
        System.out.println(name + ": - I'm waiting!");
        speed = 0;
        movement = false;
    }

    void move(float distanceInMeters) {
        movement = true;
        speed += 3;
        String movementType;
        if (speed <= 3) {
            movementType = "walked";
        } else {
            movementType = "runned";
        }
        float convert = (float) speed / 3.6f;
        for (float i = convert; i <= distanceInMeters; i += convert) {
            System.out.println(name + " " + movementType + " " + i + " meters.");
        }
        stay();
    }

    void run(float distanceInMeters) {
        movement = true;
        speed += 4;
        move(distanceInMeters);
    }

    void jump() {
        System.out.println(name + " jumped up!");
        stay();
    }

    void say(String whtToSay) {
        System.out.println(name + ": - " + whtToSay);
    }

    void learningJava() {
        System.out.println(name + ": - I'm learning JAVA!");
    }
}