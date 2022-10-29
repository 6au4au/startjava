package service;

import entity.*;

//Здесь только создание объектов и вызов сервисов!
//Сценарии!
public class Main {

    public static void main(String[] args) {
        //Тест аккаунты:
        Person person1 = new Person("Jack", "Holder", "[+78]7777666333");
        Bill bill1 = new Bill(5000.0f);
        Account account1 = new Account(person1, bill1);

        Person person2 = new Person("Sigmund", "Freud", "[+57]777777777");
        Bill bill2 = new Bill(150000.0f);
        Account account2 = new Account(person2, bill2);

        //Тест сервисы:
        DepositService deposit = new DepositService();

        System.out.println("Состояние счета: " + account1.getBill().getAmount());
        
        System.out.println("После пополнения: ");
        System.out.println("account1.g");

    }
}
