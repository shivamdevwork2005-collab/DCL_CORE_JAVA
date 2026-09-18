package OOPS.TypeCasting.SpecializationAndGenralization;

public class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name +" is an animal.");
    }
}
