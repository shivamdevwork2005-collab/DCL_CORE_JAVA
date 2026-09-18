package OOPS.SupperCalling;

 // Implicit super();
//class Father{
//    Father(){
//        System.out.println(1);
//    }
//}
//
//class Child extends Father{
//    Child(){
//        System.out.println(2);
//    }
//}

// Explicit super();
class GrandFather{
    int age;
    GrandFather(int age){
        this.age = age;
    }
}



class Father extends GrandFather{
    int age;
    String name;
    Father(int age){
        this(age,"Ramesh");
        this.age = age;
        System.out.println("Fathers Age:-"+age);
    }

    Father(int age , String name){
        super(99);
        System.out.println(age);
        this.name = name;
        System.out.println(name);
    }
}

class Child extends Father{
    int age;
    Child(int age){
        super(60);
        this.age = age;
        System.out.println("Child Age:-"+ age);
    }

    Child(String name){
        super(90,"Rakesh");
        System.out.println(name);
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("Start");
        Child c1 = new Child(20);
        Child c2 = new Child("Abhay");
        System.out.println("End");
    }
}
