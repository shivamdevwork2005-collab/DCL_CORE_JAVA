package SortingTechnique;

public class InsertionSort {
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println('\n');
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("Before Sorting");
        print(arr);
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("After Sorting");
        print(arr);
    }
}
