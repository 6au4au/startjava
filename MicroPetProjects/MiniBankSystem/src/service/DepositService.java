package service;

import entity.*;

//Перевод - увеличение счета!
public class DepositService {

    boolean replenish(Account current, float amount ) {
        Bill bill = new Bill(amount);
        Deposit deposit = new Deposit();

        if (!deposit.conductTransaction(current, bill))
            return false;

        return true;
    }
}
