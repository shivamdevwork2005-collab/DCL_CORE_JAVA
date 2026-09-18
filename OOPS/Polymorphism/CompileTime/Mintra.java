package OOPS.Polymorphism.CompileTime;

public class Mintra {
     void purchase(String product){
         System.out.println(product);
     }

     void purchase(int price){
         System.out.println(price);
     }

     void purchase(String brand,int price){
         System.out.println(brand+" "+price);
     }
}
