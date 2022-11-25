package Data;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Checker {
        static String Questions = "D:\\My Works\\Programming\\Java\\Project3\\Database\\MidtermExam\\Questions.txt";
        static String Choice = "D:\\My Works\\Programming\\Java\\Project3\\Database\\MidtermExam\\Choice.txt";
        static String Choice1 = "D:\\My Works\\Programming\\Java\\Project3\\Database\\MidtermExam\\Choice1.txt";
        static String Answers = "D:\\My Works\\Programming\\Java\\Project3\\Database\\MidtermExam\\Answers.txt";
        static String Answers1 = "D:\\My Works\\Programming\\Java\\Project3\\Database\\MidtermExam\\Answers1.txt";
        static Scanner s = new Scanner(System.in);
        static int score = 0;

        public void Check() {
                try {
                        Path P = Paths.get(Questions.toString());
                        InputStream I = Files.newInputStream(P);
                        BufferedReader R = new BufferedReader(new InputStreamReader(I));

                        Path P1 = Paths.get(Choice.toString());
                        InputStream I1 = Files.newInputStream(P1);
                        BufferedReader R1 = new BufferedReader(new InputStreamReader(I1));

                        Path P2 = Paths.get(Choice1.toString());
                        InputStream I2 = Files.newInputStream(P2);
                        BufferedReader R2 = new BufferedReader(new InputStreamReader(I2));

                        Path P3 = Paths.get(Answers.toString());
                        InputStream I3 = Files.newInputStream(P3);
                        BufferedReader R3 = new BufferedReader(new InputStreamReader(I3));

                        Path P4 = Paths.get(Answers1.toString());
                        InputStream I4 = Files.newInputStream(P4);
                        BufferedReader R4 = new BufferedReader(new InputStreamReader(I4));

                        String answ[] = new String[45];
                        String A[] = new String[45];
                        Questions[] question = {
                                        new Questions(A[0] = R.readLine(), A[0] = R1.readLine(), A[0] = R2.readLine(),
                                                        A[0] = R3.readLine()),
                                        new Questions(A[1] = R.readLine(), A[1] = R1.readLine(), A[1] = R2.readLine(),
                                                        A[1] = R3.readLine()),
                                        new Questions(A[2] = R.readLine(), A[2] = R1.readLine(), A[2] = R2.readLine(),
                                                        A[2] = R3.readLine()),
                                        new Questions(A[3] = R.readLine(), A[3] = R1.readLine(), A[3] = R2.readLine(),
                                                        A[3] = R3.readLine()),
                                        new Questions(A[4] = R.readLine(), A[4] = R1.readLine(), A[4] = R2.readLine(),
                                                        A[4] = R3.readLine()),
                                        new Questions(A[5] = R.readLine(), A[5] = R1.readLine(), A[5] = R2.readLine(),
                                                        A[5] = R3.readLine()),
                                        new Questions(A[6] = R.readLine(), A[6] = R1.readLine(), A[6] = R2.readLine(),
                                                        A[6] = R3.readLine()),
                                        new Questions(A[7] = R.readLine(), A[7] = R1.readLine(), A[7] = R2.readLine(),
                                                        A[7] = R3.readLine()),
                                        new Questions(A[8] = R.readLine(), A[8] = R1.readLine(), A[8] = R2.readLine(),
                                                        A[8] = R3.readLine()),
                                        new Questions(A[9] = R.readLine(), A[9] = R1.readLine(), A[9] = R2.readLine(),
                                                        A[9] = R3.readLine()),
                                        new Questions(A[10] = R.readLine(), A[10] = R1.readLine(),
                                                        A[10] = R2.readLine(), A[10] = R3.readLine()),
                                        new Questions(A[11] = R.readLine(), A[11] = R1.readLine(),
                                                        A[11] = R2.readLine(), A[11] = R3.readLine()),
                                        new Questions(A[12] = R.readLine(), A[12] = R1.readLine(),
                                                        A[12] = R2.readLine(), A[12] = R3.readLine()),
                                        new Questions(A[13] = R.readLine(), A[13] = R1.readLine(),
                                                        A[13] = R2.readLine(), A[13] = R3.readLine()),
                                        new Questions(A[14] = R.readLine(), A[14] = R1.readLine(),
                                                        A[14] = R2.readLine(), A[14] = R3.readLine()),
                                        new Questions(A[15] = R.readLine(), A[15] = R1.readLine(),
                                                        A[15] = R2.readLine(), A[15] = R3.readLine()),
                                        new Questions(A[16] = R.readLine(), A[16] = R1.readLine(),
                                                        A[16] = R2.readLine(), A[16] = R3.readLine()),
                                        new Questions(A[17] = R.readLine(), A[17] = R1.readLine(),
                                                        A[17] = R2.readLine(), A[17] = R3.readLine()),
                                        new Questions(A[18] = R.readLine(), A[18] = R1.readLine(),
                                                        A[18] = R2.readLine(), A[18] = R3.readLine()),
                                        new Questions(A[19] = R.readLine(), A[19] = R1.readLine(),
                                                        A[19] = R2.readLine(), A[19] = R3.readLine()),
                                        new Questions(A[20] = R.readLine(), A[20] = R1.readLine(),
                                                        A[20] = R2.readLine(), A[20] = R3.readLine()),
                                        new Questions(A[21] = R.readLine(), A[21] = R1.readLine(),
                                                        A[21] = R2.readLine(), A[21] = R3.readLine()),
                                        new Questions(A[22] = R.readLine(), A[22] = R1.readLine(),
                                                        A[22] = R2.readLine(), A[22] = R3.readLine()),
                                        new Questions(A[23] = R.readLine(), A[23] = R1.readLine(),
                                                        A[23] = R2.readLine(), A[23] = R3.readLine()),
                                        new Questions(A[24] = R.readLine(), A[24] = R1.readLine(),
                                                        A[24] = R2.readLine(), A[24] = R3.readLine()),
                                        new Questions(A[25] = R.readLine(), A[25] = R1.readLine(),
                                                        A[25] = R2.readLine(), A[25] = R3.readLine()),
                                        new Questions(A[26] = R.readLine(), A[26] = R1.readLine(),
                                                        A[26] = R2.readLine(), A[26] = R3.readLine()),
                                        new Questions(A[27] = R.readLine(), A[27] = R1.readLine(),
                                                        A[27] = R2.readLine(), A[27] = R3.readLine()),
                                        new Questions(A[28] = R.readLine(), A[28] = R1.readLine(),
                                                        A[28] = R2.readLine(), A[28] = R3.readLine()),
                                        new Questions(A[29] = R.readLine(), A[29] = R1.readLine(),
                                                        A[29] = R2.readLine(), A[29] = R3.readLine()),
                                        new Questions(A[30] = R.readLine(), A[30] = R1.readLine(),
                                                        A[30] = R2.readLine(), A[30] = R3.readLine()),
                                        new Questions(A[31] = R.readLine(), A[31] = R1.readLine(),
                                                        A[31] = R2.readLine(), A[31] = R3.readLine()),
                                        new Questions(A[32] = R.readLine(), A[32] = R1.readLine(),
                                                        A[32] = R2.readLine(), A[32] = R3.readLine()),
                                        new Questions(A[33] = R.readLine(), A[33] = R1.readLine(),
                                                        A[33] = R2.readLine(), A[33] = R3.readLine()),
                                        new Questions(A[34] = R.readLine(), A[34] = R1.readLine(),
                                                        A[34] = R2.readLine(), A[34] = R3.readLine()),
                                        new Questions(A[35] = R.readLine(), A[35] = R1.readLine(),
                                                        A[35] = R2.readLine(), A[35] = R3.readLine()),
                                        new Questions(A[36] = R.readLine(), A[36] = R1.readLine(),
                                                        A[36] = R2.readLine(), A[36] = R3.readLine()),
                                        new Questions(A[37] = R.readLine(), A[37] = R1.readLine(),
                                                        A[37] = R2.readLine(), A[37] = R3.readLine()),
                                        new Questions(A[38] = R.readLine(), A[38] = R1.readLine(),
                                                        A[38] = R2.readLine(), A[38] = R3.readLine()),
                                        new Questions(A[39] = R.readLine(), A[39] = R1.readLine(),
                                                        A[39] = R2.readLine(), A[39] = R3.readLine()),
                                        new Questions(A[40] = R.readLine(), A[40] = R1.readLine(),
                                                        A[40] = R2.readLine(), A[40] = R3.readLine()),
                                        new Questions(A[41] = R.readLine(), A[41] = R1.readLine(),
                                                        A[41] = R2.readLine(), A[41] = R3.readLine()),
                                        new Questions(A[42] = R.readLine(), A[42] = R1.readLine(),
                                                        A[42] = R2.readLine(), A[42] = R3.readLine()),
                                        new Questions(A[43] = R.readLine(), A[43] = R1.readLine(),
                                                        A[43] = R2.readLine(), A[43] = R3.readLine()),
                                        new Questions(A[44] = R.readLine(), A[44] = R1.readLine(),
                                                        A[44] = R2.readLine(), A[44] = R3.readLine())
                        };

                        String answ1[] = new String[15];
                        String A1[] = new String[15];
                        Questions[] question1 = {
                                        new Questions(A1[0] = R4.readLine()),
                                        new Questions(A1[1] = R4.readLine()),
                                        new Questions(A1[2] = R4.readLine()),
                                        new Questions(A1[3] = R4.readLine()),
                                        new Questions(A1[4] = R4.readLine()),
                                        new Questions(A1[5] = R4.readLine()),
                                        new Questions(A1[6] = R4.readLine()),
                                        new Questions(A1[7] = R4.readLine()),
                                        new Questions(A1[8] = R4.readLine()),
                                        new Questions(A1[9] = R4.readLine()),
                                        new Questions(A1[10] = R4.readLine()),
                                        new Questions(A1[11] = R4.readLine()),
                                        new Questions(A1[12] = R4.readLine()),
                                        new Questions(A1[13] = R4.readLine()),
                                        new Questions(A1[14] = R4.readLine())
                        };
                        boolean Bonus = true;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println(
                                        "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                        "║===--                       Repubilic of the Philippines                                                    --===║");
                        System.out.println(
                                        "║    ╔═════════╗             OCCIDENTAL MINDORO STATE COLLEGE                                      ╔═════════╗    ║");
                        System.out.println(
                                        "║    ║         ║             Labagnan, San Jose Occidental Midoro                                  ║         ║    ║");
                        System.out.println(
                                        "║    ║  Image  ║             Website: www.omsc.edu.ph  Email address: OMSC_9747@yahoo.com          ║  Image  ║    ║");
                        System.out.println(
                                        "║    ║         ║             Tele/Fax: (043) 457-225                                               ║         ║    ║");
                        System.out.println(
                                        "║    ╚═════════╝                                                                                   ╚═════════╝    ║");
                        System.out.println(
                                        "║===--                               College or Arts, Sciences, and Technology                               --===║");
                        System.out.println(
                                        "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        System.out.println(
                                        "                                       MIDTERM EXAMINATION, A.Y. 2022-2023                                         ");
                        System.out.println(
                                        "                                           COMPUTER PROGRAMMING 1 (jAVA)                                           ");
                        System.out.println("");
                        System.out.println(
                                        "I - Enter the correct letter for each of the following question. Enter only one letter for each item by inputing\nthe corresponding to the letter of your choice on the answer sheet provided.");

                        for (int i = 0; i < question.length; i++) {
                                System.out.println("\n" + question[i].Answer);
                                System.out.println(question[i].Choice);
                                System.out.println(question[i].Choice1);
                                System.out.print("Answer: ");
                                answ[i] = s.nextLine();
                                if (answ[i].equalsIgnoreCase(question[i].Prompt)) {
                                        score++;
                                }
                        }
                        if (!answ[10].equalsIgnoreCase("C")) {
                                score++;
                        }
                        if (answ[4].equalsIgnoreCase("D")) {
                                score++;
                        }
                        System.out.println(
                                        "\n\nTEST II\n Direction: Identify and fill the missing element/codes to complete the program.");
                        System.out.print("\n\n");

                        System.out.println("import (1)__________;");
                        System.out.println(
                                        "public (2)__________ GradingSystem {");
                        System.out.println(
                                        "      public (3)__________ (4)__________ (5)__________ (String[] args);");
                        System.out.println(
                                        "      (6)__________ input (7)__________ Scanner((8)__________);");
                        System.out.println("      double midGrade = 0.4;");
                        System.out.println(
                                        "      (9)__________ finalGrade = 0.6;");
                        System.out.println(
                                        "      double  midUser, finalUser, finalResult, resultMid, resultFinale;");
                        System.out.println(
                                        "      System.out.(10)__________(\"Enter your midterm grade: \");");
                        System.out.println(
                                        "      midUser = input.(11)__________;");
                        System.out.println(
                                        "      resultMid = midUser * midGrade;\n\n");
                        System.out.println(
                                        "      System.out.println(\"Enter your finalterm grade: \");");
                        System.out.println(
                                        "      finalUser = (12)__________.nextDouble();");
                        System.out.println(
                                        "      resultFinal = finalUser * finalGrade;\n\n");
                        System.out.println(
                                        "      finalResult = (13)__________ * resultFinal;");
                        System.out.println(
                                        "      System.out.println(\"Your final resut is \" + Math.round(finalResult));");
                        System.out.println("      (14)__________");
                        System.out.println("(15)__________");
                        int c = 0;

                        for (int i = 0; i < question1.length; i++) {
                                c++;
                                System.out.print(c + ". ");
                                answ1[i] = s.nextLine();
                                if (answ1[i].equalsIgnoreCase(question1[i].Answer1)) {
                                        score++;
                                }
                        }

                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println(
                                        "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "║                           ----===Final Score of your Midterm Examination===----                                 ║");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        System.out.println("\nPrepared by: ");
                        System.out.println("MARIA REGINA C. FLORES");
                        System.out.println("Part-Time Instructor\n");
                        System.out.println("LEIZA LINDAL. PELAYO, MAITE");
                        System.out.println("Instructor I");
                        System.out.println("\n\n        Thanks for answering the Midterm Examination!");
                        System.out.println("\n  Your Final Score is = " + score
                                        + "/60");
                        System.out.println(
                                        "\n\nWould you wish to see your all answers & correct/incorrect ");
                        System.out.print("Enter Yes/Y: ");
                        String dasd = s.next();
                        int a = 1, b = 1;
                        if (dasd.equalsIgnoreCase("Yes") || dasd.equalsIgnoreCase("Y")) {
                                System.out.println(
                                                "\n\n\nC = Correct Answers\nW = Wrong Answers\n\nTEST I\n4. C or D\n10. Bonus\n");
                                for (int i = 0; i < answ.length; i++) {
                                        System.out.print(a + ". " + answ[i]);
                                        a++;
                                        if (answ[i].equalsIgnoreCase(question[i].Prompt)) {
                                                System.out.println(" C");
                                        } else {
                                                System.out.println(" W the Correct Answer:  " + question[i].Prompt);
                                        }
                                }
                                System.out.println("\nTEST II\n");
                                for (int i = 0; i < question1.length; i++) {
                                        System.out.print(b + ". " + answ1[i]);
                                        b++;
                                        if (answ1[i].equals(question1[i].Answer1)) {
                                                System.out.println(" C");
                                        } else {
                                                System.out.println(" W the Correct Answer:  " + question1[i].Answer1);
                                        }
                                }
                        }
                        System.out.println("\n\n1. Back to Login Page");
                        System.out.print("Enter a Number    : ");
                        int yes = s.nextInt();
                        R.close();
                        R1.close();
                        R2.close();
                        R3.close();
                } catch (Exception e) {
                        System.out.print(e.getMessage());
                }
        }

}
