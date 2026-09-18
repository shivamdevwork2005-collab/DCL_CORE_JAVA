package OOPS.Misleneous;

public class ArrayPractice {
    static void main(String[] args) {
        int a = 10;
        short b = 20;
        byte c = 30;
        char ch = 'A';
        int[] arr = new int[4];
        arr[0]= a;
        arr[1]= b;
        arr[2]= c;
        arr[3]= ch;

        int n1 = arr.length;

        for(int i=0;i<n1;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr.toString());
        System.out.println('\n');
        System.out.println(arr.getClass());
        System.out.println('\n');

        double [] arr2 = {1,2.0f,1.2d,20,'A','c',12L};
        int n2 = arr2.length;
        for(int i=0;i<n2;i++) {
            System.out.println(arr2[i]);
        }
        System.out.println('\n');
        System.out.println(arr.getClass());
        System.out.println(arr instanceof Object);

        System.out.println('\n');
        String[] str = new String[10];
        System.out.println(str.getClass());


        //the actual object belongs to the corresponding JVM-generated array class.
        //These are different array types/classes at runtime.
        //But All Arrays Are Objects.

    }
}
