package entity;

//Платеж!
public class Payment {
    private Bill bill;

    public Payment() {
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
