package OOPS.OverridingEx.Watsapp;

public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("Overloading 1");
    }

    ConstructorOverloading(int a){
        System.out.println(a);
    }

    ConstructorOverloading(double d){
        System.out.println(d);
    }

    ConstructorOverloading(String name, int age){
        System.out.println(name+" "+age);
    }

    ConstructorOverloading(int age,String name){
        System.out.println(age+" "+name);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(10);
        ConstructorOverloading c5 = new ConstructorOverloading(20.44);
        ConstructorOverloading c3 = new ConstructorOverloading(20,"C");
        ConstructorOverloading c4 = new ConstructorOverloading("C",30);


    }
}
