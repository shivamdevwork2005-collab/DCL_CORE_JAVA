package OOPS.Misleneous;

class GrandFather{
    public void Bike(){
        System.out.println("GrandFather,s Bike");
    }
}

class Father extends GrandFather{
    @Override
    public void Bike(){
        super.Bike();
        System.out.println("Father's Vintage Bike");
    }
}

class Child extends Father {
    @Override
    public void Bike() {
        super.Bike();
        System.out.println("Child's Chapri Bike");
    }
}

public class MethodOverriding {
    static void main(String[] args) {
        Father f1 = new Father();
        f1.Bike();

        Child c1 =  new Child();
        c1.Bike();

    }
}
