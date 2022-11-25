package Java.Basics;

import java.util.Scanner;

//For Loops
public class For_Loop {
    public static void main(String[] args) {

        String names[] = { "Nics", "Nicos", "Nicholas" };
        // for (initialization;condition;operation){ }
        // i < 5//i = 1 + 5
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            // System.out.println(i);
        }

        for (int s = 0; s < names.length; s++) {
            if (names[s].equalsIgnoreCase("Nicos")) {
                System.out.println("We Founds " + names[s]);
                break;
            } else {
                System.out.println(names[s]);
            }
        }

        // Name Search
        Scanner s = new Scanner(System.in);
        System.out.print("Search the name : ");
        String search = s.next();

        for (int w = 0; w < names.length; w++) {
            if (names[w].equalsIgnoreCase(search)) {
                System.out.println("We Founds " + names[w]);
                break;
            } else {
                System.out.println(names[w]);
            }
        }

        // Account
        String usernames[] = { "nics", "nicos" };
        String passwords[] = { "asd", "123" };

        System.out.println("Enter your Username : ");
        String username = s.next();
        System.out.println("Enter your Password : ");
        String passowrd = s.next();

        for (int a = 0; a < names.length; a++) {
            // System.out.println("Index:" + a);
            // System.out.println(usernames[a]);
            // System.out.println(passwords[a]);
            if (username.equals(usernames[a]) && passowrd.equals(passwords[a])) {
                System.out.println("Welcome, " + usernames[a]);

                // break;
            } else {
                // System.out.println(names[a]);
            }
        }

    }
}
