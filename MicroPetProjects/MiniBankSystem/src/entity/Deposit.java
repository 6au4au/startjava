package entity;

//Увеличение суммы счета:
public class Deposit extends MonetaryTransaction {
    private Bill bill;


    public Deposit() {
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

    @Override
    public boolean conductTransaction(Account current, Bill bill) {
        if (!setBill(current.getBill()) || bill == null)
            return false;

        if (this.bill.setAmount(this.bill.getAmount() + bill.getAmount()) && current.setBill(this.bill)) {
            current.setBill(this.bill);
            return true;
        }

        return false;
    }
}
