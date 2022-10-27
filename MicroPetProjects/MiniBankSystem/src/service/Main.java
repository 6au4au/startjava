package service;

import entity.*;

//Здесь только создание объектов и вызов сервисов!
//Сценарии!
public class Main {

    public static void main(String[] args) {
        //Тестим функционал:
        Person person1 = new Person("Jack", "Holder", "[+78]7777666333");
        Bill bill1 = new Bill(5000.0f);
        Account account1 = new Account(person1, bill1);

        Person person2 = new Person("Zigmund", "Freid", "[+57]777777777");
        Bill bill2 = new Bill(150000.0f);
        Account account2 = new Account(person2, bill2);
    }
}
