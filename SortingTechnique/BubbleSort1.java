package SortingTechnique;

public class BubbleSort1 {
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println('\n');
    }

    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Before Sorting");
        print(arr);
        // worst Algorithm
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        print(arr);

        System.out.println('\n');

        int[] crr = { 5, 4, 3, 2, 1 };

        // Little Best Approach
        System.out.println("Before Sorting");
        print(crr);
        for(int i=0;i<crr.length;i++){
            for(int j=0;j<crr.length-1-i;j++){
                if(crr[j]>crr[j+1]){
                    int temp = crr[j];
                    crr[j] = crr[j+1];
                    crr[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        print(crr);

        // OverAll best Approach
        System.out.println('\n');
        int[] crr3 = { 9, 4, 3, 2, 1 };
        System.out.println("Before Sorting");
        print(crr3);

        if(!isSorted(crr3)){
            for(int i=0;i<crr3.length-1;i++){
                for(int j=0;j<crr3.length-1-i;j++){
                    if(crr3[j]>crr3[j+1]){
                        int temp = crr3[j];
                        crr3[j] = crr3[j+1];
                        crr3[j+1] = temp;
                    }
                }
            }
        }

        System.out.println("After Sorting");
        print(crr3);

        System.out.println('\n');



    }
}
