package entity;

//Обертка для денежной массы:
public class Bill {
    private float amount;

    public Bill(float amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
