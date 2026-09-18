package OOPS.Encapsulation;

public class App {
    static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.getPrice());
        d1.setPrice(50);
        System.out.println(d1.getPrice());

        System.out.println();

        System.out.println(d1.getBalance());
        d1.addBalance(12000);
        System.out.println(d1.getBalance());

        System.out.println('\n');
        // Back Account;
        BackAccount b1 = new BackAccount();
        b1.deposit(10000);
        System.out.println(b1.getBalance());
        b1.withdraw(5000);
        System.out.println(b1.getBalance());
    }
}
