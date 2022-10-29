package service;

import entity.*;

import java.sql.SQLOutput;
import java.util.Scanner;

//Здесь только создание объектов и вызов сервисов!
//Сценарии!
public class Main {

    public static void main(String[] args) {
        //Тест аккаунты:
        Person person1 = new Person("Jack", "Holder", "[+78]7777666333");
        Bill bill1 = new Bill(3250.57f);
        Account account1 = new Account(person1, bill1);

        Person person2 = new Person("Sigmund", "Freud", "[+57]777777777");
        Bill bill2 = new Bill();
        Account account2 = new Account(person2, bill2);

        //Deposit TEST:
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите сумму пополнения: ");
        float sum = input.nextFloat();
        System.out.println();
        input.close();

        Bill bug = null;
        if(!account1.setBill(bug))
            System.out.println("NPE SOSI CHUY");

        DepositService deposit = new DepositService();
        System.out.println("Состояние счета: " + account1.getBill().getAmount());
        System.out.println("Сумма пополнения: " + sum);
        System.out.println("Начинаем транзакцию...");
        if (!deposit.replenish(account1, sum)) {
            System.out.println("Ошибка... повторите снова (dev: DepositService - bill err)");
        } else {
            System.out.println("Процесс...");
            System.out.println("Пополение на " + sum + " Текущее состояние счета: " + account1.getBill().getAmount());
        }
    }
}
