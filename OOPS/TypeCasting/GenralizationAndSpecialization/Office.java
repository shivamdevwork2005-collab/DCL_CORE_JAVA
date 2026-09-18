package OOPS.TypeCasting.GenralizationAndSpecialization;

public class Office {

    public void hire(Employee e){ // This is generalization Upcasting which prevents us from Method overloading

        if(e instanceof Developer){
            Developer d = (Developer) e; // down casting or specialization used to access both parent and child class properties
            System.out.println("-----------------------------------");
            System.out.println("Company:-"+d.comp);
            System.out.println("Slary:-"+d.devSal);
            System.out.println("-----------------------------------\n");
        }

        else if(e instanceof Hr){
            Hr h = (Hr) e;
            System.out.println("-------------------------------");
            System.out.println("Company:-"+h.comp);
            System.out.println("Slary:-"+h.hrSal);
            System.out.println("--------------------------------\n");
        }
        else if(e instanceof Tester){
            Tester t = (Tester) e;
            System.out.println("--------------------------------");
            System.out.println("Company:-"+t.comp);
            System.out.println("Slary:-"+t.testerSal);
            System.out.println("---------------------------------\n");
        }

        else if(e instanceof Employee){
            System.out.println("----------------------------------");
            System.out.println("Company of EMployee is:-"+e.comp);
            System.out.println("-----------------------------------\n");
        }
    }
}
