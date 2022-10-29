package entity;

//Обертка для денежной массы:
public class Bill {
    private float amount;

    public Bill(float amount) {
        if (amount > 0)
            this.amount = amount;
    }

    public Bill() {}

    public float getAmount() {
        return amount;
    }

    public boolean setAmount(float amount) {
        if (amount <= 0)
            return false;

        this.amount = amount;
        return true;
    }
}
