package entity;

//Сам аккаунт!
public class Account {
    private Person accountHolder;
    private Bill bill;
    private long iban;

    public Account(Person accountHolder, Bill bill) {
        this.accountHolder = accountHolder;
        this.bill = bill;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Bill getBill() {
        return bill;
    }

    public boolean setBill(Bill bill) {
        if (bill == null)
            return false;

        this.bill = bill;
        return true;
    }
}
