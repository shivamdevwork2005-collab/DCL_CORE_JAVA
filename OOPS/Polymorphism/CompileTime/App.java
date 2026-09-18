package OOPS.Polymorphism.CompileTime;

public class App {
    static void main(String[] args) {
        Mintra m = new Mintra();
        m.purchase(120); // decided at compilatin only ctrl+click and see which one will execute
        m.purchase("Shoes");
        m.purchase("Kurta",1200);
    }
}
