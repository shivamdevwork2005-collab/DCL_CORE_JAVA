package PatternPrinting;

public class PatternSqCutTech {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=i-1;j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println("\n");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=n-i;j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++) System.out.print("*");
            for(int j=1;j<=i-1;j++) System.out.print(" ");
            for(int j=1;j<=i-1;j++) System.out.print(" ");
            for(int j=1;j<=n-i+1;j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");


        // fussion pattern
        n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        n=4;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");

        // Dimond Problem

        n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=i-1;j++) System.out.print("*");
            System.out.println();
        }
        n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(" ");
            for(int j=1;j<=n-i+1;j++) System.out.print("*");
            for(int j=1;j<=n-i;j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");

        n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j== n) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");

        n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n || i==j || (i+j)==(n+1)) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");

        n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1-4 || i==j-4 || i==j+4 || i+j==n+1+4 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("\n");

        // Butterfly Pattern
        n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("/n/n");

    }
}





































