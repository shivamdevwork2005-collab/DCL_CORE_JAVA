package OOPS.OverridingEx.Watsapp;

public class Watsapp3 extends Watsapp2 {
    @Override
    public void message() {
        super.message();
        System.out.println("Watsapp3 message with blue tick");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Watsapp3 call method have video");
    }

    public void status() {
        System.out.println("Watsapp3 status is been Used");
    }

}
