package Java.Basics;

public class Meth {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println(a < b && a++ < c);
        System.out.println(a < b || a++ < c);
        System.out.println(!(a < b) && a++ < c);

        int x = 2;
        int y = 5;
        int z = 12;

        int exp1 = x + (z / x + (z % y) * (z - x));// 10 -
        int exp2 = z / x + y * x - (y + x) % z;// 5
        int exp3 = 4 / 2 + 8 * 4 - (5 + 2) % 3;

        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println(exp3);
        // System.out.println(exp3+exp1);
    }
}
