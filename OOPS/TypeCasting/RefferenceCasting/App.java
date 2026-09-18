package OOPS.TypeCasting.RefferenceCasting;

public class App {
    static void main(String[] args) {
        // upcasting
        Vehicle v = new Car();
        System.out.println(v.brand);
        v.start();

        System.out.println('\n');

        // downcasting
        Car c = (Car)v;
        System.out.println(c.brand);
        System.out.println(c.type);
        c.start();
        c.shiftGear();
    }
}
