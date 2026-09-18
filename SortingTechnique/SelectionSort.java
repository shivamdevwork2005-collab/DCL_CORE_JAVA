package SortingTechnique;

public class SelectionSort {
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println('\n');
    }

    public static void main(String[] args) {
        int[]arr = {3,4,0,1,2,7,8};
        System.out.println("Before Sorting");
        print(arr);

        for(int i=0;i<arr.length-1;i++){
            int minIdx = -1;
            int minVal = Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(minVal > arr[j]){
                    minVal = arr[j];
                    minIdx = j;
                }
            }

            int temp =  arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting");
        print(arr);

        System.out.println('\n');

        int[] arr2 = {9,3,4,0,1,2,7,8};
        System.out.println("Before Sorting");
        print(arr2);

        for(int i = arr2.length-1; i>0 ; i--){
            int maxIdx = -1;
            int maxVal = Integer.MIN_VALUE;
            for(int j=i;j>=0;j--){
                if(maxVal < arr2[j]){
                    maxVal = arr2[j];
                    maxIdx = j;
                }
            }

            int temp =  arr2[maxIdx];
            arr2[maxIdx] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("After Sorting");
        print(arr2);

    }
}








































































