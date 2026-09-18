package OOPS.Misleneous;

public class Product {
    Product(){
        System.out.println("Product");
    }

    Product(double discount){
        System.out.println(discount);
    }

    Product(String brand){
        System.out.println(brand);
    }
    Product(String brand,double discount){
        System.out.println(brand+" "+discount);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(23.3);
        Product p3 = new Product("p1",23.3);
        Product p4 = new Product( "p2");
    }
}
