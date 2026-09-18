package PatternPrinting;

// Define the Main class
public class PatternPrinting {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Define the size of patterns
        int n = 5;
        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i for columns
            for(int j = 1; j <= i; j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i-1 for columns
            for(int j = 1; j <= i-1; j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i+1 for columns
            for(int j = 1; j <= i+1; j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i*n+1 for columns
            for(int j = 1; j <= (i*n + 1); j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i+i-1 for columns (odd numbers)
            for(int j = 1; j <= (i+i-1); j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i+i for columns (even numbers)
            for(int j = 1; j <= i+i; j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to n-i+1 for columns (decreasing pattern)
            for(int j = 1; j <= (n-i+1); j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to n-i+n-i+1 for columns (decreasing odd pattern)
            for(int j = 1; j <= (n-i + n-i+1); j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i for asterisks
            for(int j = 1; j <= i; j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }

            // Inner loop from 1 to n-i for hash symbols
            for(int j=1;j<=n-i;j++){
                // Print hash symbol for each column
                System.out.print(" # ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to i-1 for spaces
            for(int j = 1; j <= i-1; j++){
                // Print spaces for alignment
                System.out.print("   ");
            }

            // Inner loop from 1 to n-i+1 for asterisks
            for(int j=1;j<=n-i+1;j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }

            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to n-i for spaces
            for(int j = 1; j <= n-i; j++){
                // Print spaces for alignment
                System.out.print("   ");
            }

            // Inner loop from 1 to i for asterisks
            for(int j=1;j<=i;j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }
            // Move to next line after each row
            System.out.println();
        }

        // Print blank line for separation
        System.out.println();

        // Loop from 1 to n for rows
        for(int i = 1; i <= n; i++){
            // Inner loop from 1 to n-i for spaces
            for(int j = 1; j <= n-i; j++){
                // Print spaces for alignment
                System.out.print("   ");
            }

            // Inner loop from 1 to i+i-1 for asterisks (pyramid pattern)
            for(int j=1;j<=(i+i-1);j++){
                // Print asterisk for each column
                System.out.print(" * ");
            }

            // Move to next line after each row
            System.out.println();
        }

        // End of main method
        System.out.println();


    }

    // End of Main class
}