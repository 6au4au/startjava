package com.startjava.lesson_2_3.guess;


class Player {
    private String name;
    private int number;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int number) {
        if (number <= 0 || number > 100) return false;
        
        this.number = number;
        return true;
    }
}