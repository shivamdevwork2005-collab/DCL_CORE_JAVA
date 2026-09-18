package OOPS.TypeCasting.SpecializationAndGenralization;

public class App {
    static void main(String[] args) {
        Animal a1 = new Animal("Parent");
        a1.display();
        Animal a2 = new Lion("Lion");
        a2.display();
        Animal a3 = new Tiger("Tiger");
        a3.display();
        Animal a4 = new Zebra("Zebra");
        a4.display();
        Animal a5 = new Bear("Bear");
        a5.display();

        Lion l1 = new Lion("Lion");
        l1.Eat();
        l1.display();


        // DownCasting
        Tiger t1 = (Tiger)a3;
        t1.display();
        t1.Eat();

        // ISSUE
//        Animal a6 = new Tiger("Sheru");
//        Lion l = (Lion) a6;
//        l1.Eat(); // error wrong type casting class cast exception.

        // use instance of operator to check instance

        System.out.println(a1 instanceof  Animal);
        System.out.println(a1 instanceof   Lion);
        System.out.println(a2 instanceof   Tiger);
        System.out.println(a3 instanceof   Bear);
        System.out.println(a4 instanceof    Zebra);

    }

}
