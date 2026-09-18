package OOPS.OverridingEx.Watsapp.Instagram;

public class Insta_3 extends Insta_2{
    @Override
    void upload(){
        System.out.println("Inside upload in Instagram 3");
    }

    @Override
    void direct_massege(){
        System.out.println("Inside direct masseage Insta 3");
    }

    void story(){
        System.out.println("Inside story in Instagram 3");
    }

    void instant(){
        System.out.println("Inside instant in Instagram 3");
    }
}
