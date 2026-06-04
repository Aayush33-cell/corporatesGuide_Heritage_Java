public class ImplicitWideningDemo {
    public static void main(String[] args) {

        byte b = 10;
        short s = b;     // byte → short
        int i = s;       // short → int
        long l = i;      // int → long
        float f = l;     // long → float
        double d = f;    // float → double

        System.out.println("Byte value   : " + b);
        System.out.println("Short value  : " + s);
        System.out.println("Int value    : " + i);
        System.out.println("Long value   : " + l);
        System.out.println("Float value  : " + f);
        System.out.println("Double value : " + d);
    }
}