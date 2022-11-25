package Java.TestLab;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String emails[] = { "Shiraishi@gmail.com", "Shiraishi123@gmail.com" };
        String passwords[] = { "123456789", "abcdefghi" };

        // Can Work but can only store 1 Data
        // String email = "Shiraishi@gmail.com";
        // String Password = "123";

        System.out.print("Email    : ");
        String email = s.next();
        System.out.print("Password : ");
        String passowrd = s.next();

        boolean Exist = false;

        for (int i = 0; i < emails.length; i++) {
            if (email.equals(emails[i]) && passowrd.equals(passwords[i])) {
                Exist = true;
            }
        }
        if (Exist)
            System.out.println("Welcome!");
        else
            System.out.println("Account is not Found!");

    }

}
