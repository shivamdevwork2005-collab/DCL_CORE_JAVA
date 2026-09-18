package PatternPrinting;

public class DemoPtr {
    static void main(String[] args) {
        int num = 54301;
        String[][] arr = new String[5][5];

        for(int j=4;j>=0;j--){
            int freq = num%10;
            num/=10;
            int i = 0;
            while(i < 5 && freq!=0){
                arr[i][j] = "*";
                i++;
                freq--;
            }
        }

        System.out.println();
        for(int k=0;k<5;k++){
            for(int j=0;j<5;j++){
                System.out.print(arr[k][j]);
            }
            System.out.println();
        }
    }
}
