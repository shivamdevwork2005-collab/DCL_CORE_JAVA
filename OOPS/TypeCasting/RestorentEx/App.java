package OOPS.TypeCasting.RestorentEx;

public class App {
    static void main(String[] args) {
        Hotel h = new Hotel();

        Food f = h.orderFood(1);

        if(f instanceof Idly){
            Idly i = (Idly)f;
            System.out.println("-----------------------");
            System.out.println("Food type: "+i.type);
            System.out.println("Idly Price: "+i.idlyPrice);
            System.out.println("--------------------------");
        }
        else if(f instanceof Dosa){
            Dosa d = (Dosa)f;
            System.out.println("-----------------------");
            System.out.println("Food type: "+d.type);
            System.out.println("Dosa Price: "+d.dosaPrice);
            System.out.println("--------------------------");
        }
        else if(f instanceof Vada){
            Vada v = (Vada)f;
            System.out.println("-----------------------");
            System.out.println("Food type: "+v.type);
            System.out.println("Vada Price: "+v.vadaPrice);
            System.out.println("--------------------------");
        }
        else{
            System.out.println("---------------------");
            System.out.println("This Food is Not Vaialbale.");
            System.out.println("-----------------------");
        }
    }
}
