package OOPS.Polymorphism.RuntimePoly;

public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    public void race(){
        System.out.println("Car is racing with a speed of 150kmph");
    }

}
