package OOPS.Polymorphism.RuntimePoly;

public class App {
    static void main(String[] args) {
        Car c = new Car();
        Vehicle v = c; // upcasting
        v.start(); // here ctrl + click compiler tells that start method of vehicle will
                    // execute but jvm tells that the actual obj's method will execute is run time polymorphism.
                    // only overriden methods can be accesible in child class by upcasting to parent class only.
        Car c2 = (Car) v;
        c2.race(); // downcasting / no run time polymorphism.

        System.out.println('\n');

        Vehicle v1 = new Bike();
        v1.start();

    }
}


