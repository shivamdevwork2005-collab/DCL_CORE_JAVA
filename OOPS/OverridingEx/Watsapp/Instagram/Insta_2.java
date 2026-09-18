package OOPS.OverridingEx.Watsapp.Instagram;

public class Insta_2 extends Insta_1 {
    @Override
    void upload() {
        System.out.println("Inside upload in Instagram 2");
    }

    void direct_massege(){
        System.out.println("Inside direct masseage Insta 2");
    }
}
