package Java.TestLab;

import java.util.Scanner;

public class Quiz_n_Checker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Questions[] = { "1. What is the color of apple?\nA. Red\nB. Yellow",
                "2. What is the name of our planet?\nA. Earth\nB. Mars" };
        String Answers[] = { "A", "A" };
        String[] ans = new String[2];
        int Score = 0;

        for (int i = 0; i < Questions.length; i++) {
            System.out.println("\n" + Questions[i]);
            System.out.print("Answers : ");
            ans[i] = s.nextLine();
            if (ans[i].equalsIgnoreCase(Answers[i])) {
                Score++;
            }
        }

        System.out.println("\nYou Final Score is " + Score + "/2\n");
        System.out.println("would you like to see the result?");
        System.out.print("Enter Yes : ");
        String yes = s.nextLine();

        if (yes.equalsIgnoreCase("yes")) {
            int a = 0;
            for (int i = 0; i < ans.length; i++) {
                a++;

                System.out.print(a + ". " + ans[i]);
                if (ans[i].equalsIgnoreCase(Answers[i])) {
                    System.out.println(" Correct");
                } else {
                    System.out.println(" Wrong, the Correct Answer:  " + Answers[i]);
                }
            }
        }

    }
}