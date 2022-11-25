package Java.TestLab;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // reverse
        for (int i = 1; i <= 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
