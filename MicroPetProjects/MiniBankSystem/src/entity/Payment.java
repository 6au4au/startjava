package entity;

//Платеж!
public class Payment extends MonetaryTransaction {
    private Bill bill;

    public Payment(Bill bill) {
        this.bill = bill;
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
        if((!setBill(current.getBill()) || bill == null) || bill.getAmount() - bill.getAmount() < 0)
            return false;

        if(this.bill.setAmount(this.bill.getAmount() - bill.getAmount()) && current.setBill(bill))
            return true;

        return false;
    }
}
