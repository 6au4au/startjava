package entity;

abstract class MonetaryTransaction {
    public abstract boolean conductTransaction(Account current, Bill bill);

}
