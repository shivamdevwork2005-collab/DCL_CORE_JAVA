package OOPS.TypeCasting;

public class Demo2 {
    static void main() {
        System.out.println(45);
        System.out.println(24.9);

        float f1 = 23.4f;
        float f2 = 23.4F;
        float f3 = (float) 34.5;

        System.out.println(f1);
        System.out.println(((Object)f1).getClass().getSimpleName());
        System.out.println(Float.floatToRawIntBits(f1));

    }
}
