package Java.Basics;

import java.util.Scanner;

// Conditional Statement IF, ELSE, ELSE IF + Nested
// Don't Run the File use Different file to test it
public class If_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // -------------------------IF, ELSE Condition-----------------------------
        // Basics
        // Example 1
        boolean True = true;
        if (True) {
            System.out.println("You're Verified");
        }
        // Example 2
        int age = 13;
        if (age >= 18) {
            System.out.println("You're Verified");
        } else {
            System.out.println("You're not Verified");
        }

        // With User Input
        // Example 1
        int ages;
        System.out.print("Enter your Ages :");
        ages = s.nextInt();

        if (ages >= 18) {
            System.out.println("You're Verified");
        } else {
            System.out.println("You're not Verified");
        }

        // Example 2
        int Age;
        int legalage = 18; // Added LegalAge
        System.out.print("Enter your Ages :");
        Age = s.nextInt();

        if (Age >= legalage) {
            System.out.println("You're Verified");
        } else {
            System.out.println("You're not Verified");
        }

        // ---------------------IF, ELSE, ElSE IF Condition------------------------
        // Else If is same as If you will add another Condition
        int aGe;
        System.out.print("Enter your Ages :");
        aGe = s.nextInt();

        if (aGe >= 18) {
            System.out.println("You're Verified");
        } else if (aGe >= 13) {
            System.out.println("You're half Verified");
        } else {
            System.out.println("You're not Verified");
        }
        // ---------------------------Nested Condition------------------------------
        int Ages;
        boolean verified = true;
        System.out.print("Enter your Ages :");
        Ages = s.nextInt();

        if (Ages >= 18) {
            System.out.println("You're Verfied");
            // nested means inside
            if (verified) {
                System.out.println("Qualified");
            } else {
                System.out.println("Non Qualified");
            }
        } else {
            System.out.println("You're not Verfied");
        }

        // ----------------------------------Bonus-------------------------------------
        System.out.print("Math      :");
        float math = s.nextFloat();
        System.out.print("Science   :");
        float science = s.nextFloat();
        System.out.print("English   :");
        float english = s.nextFloat();
        System.out.print("Filipino  :");
        float filipino = s.nextFloat();

        float average = (math + science + english + filipino) / 4;
        System.out.println();
        System.out.println("Average :" + average);

        if (average > 100)
            System.out.println("Invalid Score");
        else if (average >= 98)
            System.out.println("With Highest Honors");
        else if (average >= 95)
            System.out.println("With High Honors");
        else if (average >= 90)
            System.out.println("With Honors");
        else if (average >= 75)
            System.out.println("Passec");
        else
            System.out.println("Failed");

    }
}
