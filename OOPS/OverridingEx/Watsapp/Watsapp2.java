package OOPS.OverridingEx.Watsapp;

public class Watsapp2 extends Watsapp1 {
    @Override
    public void message() {
        super.message();
        System.out.println("Watsapp2 message with double tick");
    }

    public void call(){
        System.out.println("Watsapp2 call method have  audio call");
    }
}
