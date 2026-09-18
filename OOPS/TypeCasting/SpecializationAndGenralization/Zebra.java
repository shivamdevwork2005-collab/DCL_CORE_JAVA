package OOPS.TypeCasting.SpecializationAndGenralization;

public class Zebra extends Animal{
    Zebra(String name){
        super(name);
    }

    void Eat(){
        System.out.println("Zebra can eat grass");
    }
}
