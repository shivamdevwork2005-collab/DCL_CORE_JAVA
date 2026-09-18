package OOPS.AccesSpecifier;

public class AccesSpecifier {
    private String name = "Shivam";

    private AccesSpecifier(){
        System.out.println("Constructor");
    }
    private void help(){
        System.out.println(name+" is helping");
    }

    public static void main(String[] args) {
        AccesSpecifier ac = new AccesSpecifier();
        System.out.println(ac.name);
    }
}

