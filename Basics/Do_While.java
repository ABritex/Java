package Java.Basics;

import java.util.Scanner;

//While Do Condition
public class Do_While {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int u = 0;
        String names[] = { "Nics", "Nicos", "Nicholas" };
        // Not Efficient
        while (u < 5) {
            System.out.println(names[u]);
            u++;
        }
        // More Ifficient
        // System.out.println(names.length);
        int y = 0;
        while (y < names.length) {
            System.out.println(names[y]);
            y++;
        }

        int o = 5;
        do {
            System.out.println(o);
            o++;
        } while (o < 5);

        int p = 0;
        while (p < names.length) {
            if (names[p].equalsIgnoreCase("Nicholas")) {
                System.out.println("Found" + names[p]);
                break;
            } else {
                System.out.println(names[o]);
            }
            p++;
        }

        Scanner s = new Scanner(System.in);
        int q = 0;
        System.out.print("Search Name :");
        String search = s.nextLine();

        while (q < names.length) {
            if (names[q].equalsIgnoreCase(search)) {
                System.out.println("Found" + names[q]);
                break;
            } else {
                System.out.println(names[q]);
            }
            q++;
        }

        int heart = 5;
        String Ans;

        while (heart > 0) {
            System.out.println("What is name?");
            System.out.print("Answer :");
            Ans = s.next();
            if (Ans.equalsIgnoreCase("Nicholas")) {
                break;
            } else {
                heart--;
            }
        }

        if (heart > 0) {
            System.out.println("You've Won");
        } else {
            System.out.println("You've Lost");
        }
    }
}
