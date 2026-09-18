package OOPS.TypeCasting;

public class Demo {
    static void main(String[] args) {
        System.out.println("Narrowing");
        // Narrowing
        int a = 1234557737
                ;
        System.out.println(a);
        short s = (short)a;
        System.out.println(s);

        byte b1 = (byte) a;
        System.out.println(b1);

        System.out.println('\n');

        char ch1 = 'B';
        double d1 = (double) ch1;
        System.out.println(d1);

        float f2 = 34f;
        long l2 = (long) f2;
        System.out.println(f2);
        System.out.println(l2);

        double d3 = 23858568878.988493;
        System.out.println("Double d3 :-"+d3);
        int ans = (int) d3;
        System.out.println("Int ans :-"+ans);


        double d4 = 10.98;
        int res = (int)d4;
        System.out.println(res);
        System.out.println(d4);

        int asc = 65;
        char ch2 = (char) asc;
        System.out.println(ch2);

        System.out.println("\n" + "char with operations");
        System.out.println('A'-20);
        System.out.println('A'+80);
        System.out.println('a'+90);
        System.out.println("A"+89);
        System.out.println("A"+'A');



        System.out.println('\n');
        System.out.println("Widening");
        //Widening
        int b = 43;
        System.out.println(b);
        double d = b;
        System.out.println(d);

        long l = 90;
        System.out.println(l);
        float f = l;
        System.out.println(f);

        char ch = 'A';
        System.out.println(ch);
        int Ascii = ch;
        System.out.println(Ascii);



    }
}
