package Java.Basics;

import java.util.Scanner;
//Array Understanding

public class Array {
    public static void main(String[] args) {
        // Declaring with Value
        System.out.println("With Values");
        // Array Nummberings: 0 1 2 3 it starts with number 0
        String names[] = { "Nics", "Nicos", "Ncs", "Nicholas" };
        System.out.println(names[1]);

        /*
         * This can work
         * String names[] = {"Nics",
         * "Nicos",
         * "Ncs",
         * "Nicholas"};
         */

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numbers[6] + numbers[9]);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("W/O Values");

        // Declaring without Value
        Scanner s = new Scanner(System.in);
        String aName[] = new String[20];
        int aNumber[] = new int[10];

        System.out.println();
        aName[0] = s.next();

        System.out.println();
        aNumber[0] = s.nextInt();

        System.out.println(aName[0]);
        System.out.println(aNumber[0]);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Paired Array by numbers");

        String email[] = { "abeleda49@yahoo.com", "nics@gmail.com" };
        String username[] = { "nicholas", "nicos" };
        String password[] = { "123", "asd" };

        System.out.println("Index    :" + 1);
        System.out.println("Email    :" + email[1]);
        System.out.println("Username :" + username[1]);
        System.out.println("Password :" + password[1]);

        int i = 1;// 2

        System.out.println("Index    :" + i);
        System.out.println("Email    :" + email[i]);
        System.out.println("Username :" + username[i]);
        System.out.println("Password :" + password[i]);
    }
}
