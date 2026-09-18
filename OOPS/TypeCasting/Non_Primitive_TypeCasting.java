package OOPS.TypeCasting;

class Father{
    int age=90;
    void printF(){
        System.out.println("Upcasted Method");
    }
}

class Child extends Father{
    double height = 89.89;
    void printC(){
        System.out.println("DownCasted Method");
    }
}


public class Non_Primitive_TypeCasting {
    static void main(String[] args) {
        Child c1 = new Child();
        System.out.println("-----------------Usual---------------------");
        System.out.println(c1.age);
        System.out.println(c1.height);
        System.out.println("----------------Upcasting-------------------");
        Father f = c1;   // implicitly
        System.out.println(f.age);
//        System.out.println(f.hight); //error
        f.printF();

        System.out.println("---------------DownCasting--------------------");
        Child c2 = (Child)f; // Explicitly
        System.out.println(c2.age);
        System.out.println(c2.height);
        c2.printC();
    }
}
