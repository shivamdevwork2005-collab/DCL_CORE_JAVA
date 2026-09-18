package OOPS.OverridingEx.Watsapp;

class WhatsApp4 extends Watsapp3{
    @Override
    public void message() {
        System.out.println("WhatsApp4 with red tick");
    }

    @Override
    public void call() {
        System.out.println("WhatsApp4 calling with conference");
    }

    @Override
    public void status() {
        System.out.println("WhatsApp4 status with channels as well.");
    }

    public void MetaAi(){
        System.out.println("Now Meta AI inside WhatsApp4 version.");
    }
}

public class App {
    static void main(String[] args) {
        Watsapp3 watsapp3 = new Watsapp3();
        watsapp3.message();
        System.out.println('\n');
        watsapp3.call();
        System.out.println('\n');
        watsapp3.status();

        System.out.println('\n');
        WhatsApp4 WhatsApp4 = new WhatsApp4();
        WhatsApp4.message();
        System.out.println('\n');
        WhatsApp4.call();
        System.out.println('\n');
        WhatsApp4.status();
        System.out.println('\n');
        WhatsApp4.MetaAi();
        System.out.println('\n');
    }
}
