package OOPS.Misleneous;

class Vehicle{
    public void drive(){
        System.out.println("Vehicle drive");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        super.drive();
        System.out.println("Car drive");
    }
}

class Driver extends Car{
    @Override
    public void drive(){
        super.drive();
        System.out.println("Driver drive");
    }
}


public class MethodOverriding2 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive();
    }
}
