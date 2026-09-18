package OOPS.Encapsulation;

public class Demo {
    private int price=10;
    private double balance=100000.90;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        if(balance > 0) this.balance += balance;
    }

}
