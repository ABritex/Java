import java.util.*;
import Data.*;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class MainP {
        static String Con;
        static Scanner s = new Scanner(System.in);
        static Checker c = new Checker();
        static Thread t;
        String Filename = "D:\\My Works\\Programming\\Java\\Project3\\Database\\Account.txt";

        public static void main(String[] args) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(
                                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                System.out.println(
                                "║========------                                                                                     ------========║");
                System.out.println(
                                "║                          ----===DEVELOPMENT OF ONLINE EXAMINATION SYSTEM===----                                 ║");
                System.out.println(
                                "║                                      ----===FOR OMSC COLLEGE===----                                             ║");
                System.out.println(
                                "║========------                                                                                     ------========║");
                System.out.println(
                                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                System.out.println("\n\n\n");
                System.out.println(
                                "                                                ╔═════════════╗                                                    ");
                System.out.println(
                                "                                       ╔════════╣C R E D I T S╠═════════╗                                          ");
                System.out.println(
                                "                                       ║===--   ╚═════════════╝    --===║                                          ");
                System.out.println(
                                "                                       ║     asd - Head Programmer      ║                                          ");
                System.out.println(
                                "                                       ║     asd - Head Programmer      ║                                          ");
                System.out.println(
                                "                                       ║     asd - Head Programmer      ║                                          ");
                System.out.println(
                                "                                       ║     asd - Head Programmer      ║                                          ");
                System.out.println(
                                "                                       ║     asd - Head Programmer      ║                                          ");
                System.out.println(
                                "                                       ║===--    BSIT 1C           --===║                                          ");
                System.out.println(
                                "                                       ╚════════════════════════════════╝                                          ");
                System.out.println("\n\n\n\n\n");
                System.out.print(
                                "                                                                                  Enter any keys to continue.......");
                Con = s.nextLine();
                new MainP();
        }

        public MainP() {
                try {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println(
                                        "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "║                                      ----===Online  Examination===----                                          ║");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        System.out.println("\n\n\n\nChoices");
                        System.out.println("1. Login/Answer");
                        System.out.println("2. Register ");
                        System.out.println("3. Exit ");
                        System.out.print("Enter : ");
                        String Choice = s.nextLine();
                        if (Choice.equals("1")) {
                                Login();
                        } else if (Choice.equals("2")) {
                                Register();
                        } else if (Choice.equals("3")) {
                                Exit();
                        } else {
                                System.out.println("\nError input only number 1/2/3!\n");
                                System.out.print(
                                                "Enter any keys to restart");

                                Con = s.nextLine();
                                new MainP();
                        }
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }

        void Login() {
                try {
                        Path P = Paths.get(Filename.toString());
                        InputStream I = Files.newInputStream(P);
                        BufferedReader R = new BufferedReader(new InputStreamReader(I));
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println(
                                        "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "║                                        ----===Student Login===----                                              ║");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        System.out.println("\n\n\nLogin Student Account");
                        System.out.print("Username : ");
                        String Username = s.nextLine();
                        System.out.print("Password : ");
                        String Passowrd = s.nextLine();
                        String Temp = null;
                        String USerN;
                        String Pword;
                        String Fname;
                        String Lname;
                        String Mi;
                        String Lrn;
                        String Cous;
                        String Yrl;
                        String Secs;
                        String Email;
                        boolean found = false;
                        while ((Temp = R.readLine()) != null) {
                                String[] account = Temp.split(",");
                                USerN = account[0];
                                Pword = account[1];
                                Fname = account[2];
                                Lname = account[3];
                                Mi = account[4];
                                Lrn = account[5];
                                Cous = account[6];
                                Yrl = account[7];
                                Secs = account[8];
                                Email = account[9];
                                if (Username.equals(USerN) && Passowrd.equals(Pword)) {
                                        found = true;
                                }
                                if (found == true) {
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println(
                                                        "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                        System.out.println(
                                                        "║========------                                                                                     ------========║");
                                        System.out.println(
                                                        "║                                    ----===Students Login Complete===----                                        ║");
                                        System.out.println(
                                                        "║========------                                                                                     ------========║");
                                        System.out.println(
                                                        "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        System.out.println("\n\n");
                                        System.out.println("    Student's Informations:");
                                        System.out.println("    Name            : " + Fname + " " + Mi + ". " + Lname);
                                        System.out.println("    Lrn             : " + Lrn);
                                        System.out.println("    Year/Section    : " + Cous + "-" + Yrl + Secs);
                                        System.out.println("    Email           : " + Email);
                                        System.out.println("\n\n\n\n\n\n\nChoices:");
                                        System.out.println("1. Midterm Exam");
                                        System.out.println("2. Finalterm Exam");
                                        System.out.println("3. Return Back");
                                        System.out.print("Enter : ");
                                        String Choice = s.nextLine();
                                        if (Choice.equals("1")) {
                                                c.Check();
                                        } else if (Choice.equals("2")) {
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                System.out.println("Finalterm Exam is currently unavailable!");
                                                System.out.print(
                                                                "                                                                         Enter any keys to continue.......");
                                                Con = s.nextLine();
                                                new MainP();
                                        } else if (Choice.equals("3")) {
                                                System.out.print(
                                                                "                                                                         Enter any keys to continue.......");
                                                Con = s.nextLine();
                                                new MainP();
                                        } else {
                                                System.out.println("\nError input Only 1/2/3!");
                                                System.out.print("Enter : ");
                                                Choice = s.nextLine();
                                                new MainP();
                                        }
                                }
                        }
                        if (found == false) {
                                System.out.println("\n\n\nAccount is not! Invalid Username or Password!");
                                System.out.println("\n1. Retry ");
                                System.out.println("2. Return Back");
                                System.out.print("Enter : ");
                                String Choice = s.nextLine();
                                if (Choice.equals("1")) {
                                        Login();
                                } else if (Choice.equals("2")) {
                                        new MainP();
                                } else {
                                        System.out.println("\nError input only number 1 & 2!");
                                        System.out.print(
                                                        "\nEnter any keys to restart!");
                                        Con = s.nextLine();
                                        Login();
                                        ;
                                }
                        } else {
                                System.out.print(
                                                "Enter any keys to continue....... ");
                                Con = s.nextLine();
                                new MainP();
                        }
                        R.close();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }

        static boolean Created = false;

        void Register() {
                try {
                        Path P = Paths.get(Filename.toString());
                        OutputStream OP = new BufferedOutputStream(Files.newOutputStream(P, APPEND));
                        BufferedWriter W = new BufferedWriter(new OutputStreamWriter(OP));

                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println(
                                        "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "║                                      ---===Student Registrations===----                                         ║");
                        System.out.println(
                                        "║========------                                                                                     ------========║");
                        System.out.println(
                                        "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        System.out.println("\n\n\nType Your Information bellow to proceed.\n\n");
                        System.out.println("Input Username & Password");
                        System.out.print("Username        : ");
                        String UName = s.next();
                        System.out.print("Password        : ");
                        String PWord = s.next();
                        System.out.println("\nAccount Created\n\nStudent's Infomations");
                        System.out.print("First Name      : ");
                        String Fname = s.next();
                        System.out.print("Last Name       : ");
                        String Lname = s.next();
                        System.out.print("Middle Name     : ");
                        String MI = s.next();
                        System.out.print("LRN Number      : ");
                        String LRN = s.next();
                        System.out.print("Course          : ");
                        String Course = s.next();
                        System.out.print("Year Level      : ");
                        String YRL = s.next();
                        System.out.print("Section         : ");
                        String Sec = s.next();
                        System.out.print("Email(Optional) : ");
                        String Email = s.next();

                        W.write(UName + "," + PWord + "," + Fname + "," + Lname + "," + MI + "," + LRN + "," + Course
                                        + "," + YRL + "," + Sec + "," + Email);
                        W.newLine();
                        W.close();
                        OP.close();

                        runs();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }

        void runs() {
                t = new Thread() {
                        public void run() {
                                System.out.print("\nProcecessing......... ");
                                for (int i = 0; i <= 100; i++)
                                        try {
                                                {
                                                        if (i < 10) {
                                                                System.out.print(i + "%");
                                                                System.out.print("\b\b");
                                                        } else if (i >= 10 && i <= 99) {
                                                                System.out.print(i + "%");
                                                                System.out.print("\b\b\b");
                                                        }
                                                        if (i == 100) {
                                                                System.out.println(i + "%");
                                                                System.out.println(
                                                                                "\n\n   Student Account Registered Successfully Saved!");
                                                                Created = true;
                                                        }
                                                        if (Created == true) {
                                                                System.out.print(
                                                                                "\n\n                                                                         Enter any keys to continue.......");
                                                                Con = s.nextLine();
                                                                Con = s.nextLine();
                                                                Con = s.nextLine();
                                                                new MainP();
                                                        }
                                                        t.sleep(20);
                                                }
                                        } catch (InterruptedException e) {
                                                e.printStackTrace();
                                        }
                        }
                };
                t.start();
        }

        void Exit() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Thanks for using our program!");

        }
}
