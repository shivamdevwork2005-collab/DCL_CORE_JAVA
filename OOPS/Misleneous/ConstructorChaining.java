package OOPS.Misleneous;


import OOPS.Demo;

public class ConstructorChaining {

    ConstructorChaining(){
        //this(10);
        System.out.println(1);
    }

    ConstructorChaining(int a){
        this();
        System.out.println(2);
    }

    public static void main(String[] args) {
        ConstructorChaining c1=  new ConstructorChaining();
        System.out.println('\n');
        ConstructorChaining c2 = new ConstructorChaining(10);
        System.out.println('\n');
        Demo d1 = new Demo();

    }
}
