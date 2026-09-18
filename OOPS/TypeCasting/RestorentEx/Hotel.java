package OOPS.TypeCasting.RestorentEx;

public class Hotel {
    public Food orderFood(int choice){
        if(choice == 1){
            Idly i = new Idly();
            return i;
        }else if(choice == 2){
            Dosa d = new Dosa();
            return d;
        }else if(choice == 3){
            return new Vada();
        }else{
            return null;
        }
    }
}
