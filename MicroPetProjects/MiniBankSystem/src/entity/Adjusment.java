package entity;

//Увеличение суммы счета:
public class Adjusment {
    private Bill bill;


    public Adjusment(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

}
