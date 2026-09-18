package OOPS.TypeCasting.SpecializationAndGenralization;

public class Bear extends Animal{
    Bear(String name){
        super(name);
    }

    void Eat(){
        System.out.println("Bear can eat sugercan");
    }
}
