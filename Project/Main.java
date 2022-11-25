import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                boolean Proceed;
                int sw = 0, Yes = 0, yes = 1, yes1 = 0, Y = 0;
                int a = 0, score = 0, score1 = 0;
                String Fname, Lname, Mname, LRN, Email, YRL, Sec, Course, dasd = " ", NA;
                String q[] = new String[60];
                String ans[] = { "B", "B", "B", "C", "A",
                                "A", "C", "A", "A", "C",
                                "A", "C", "A", "B", "A",
                                "D", "C", "D", "A", "D",
                                "D", "D", "A", "D", "C",
                                "D", "C", "B", "A", "B",
                                "C", "C", "D", "B", "D",
                                "B", "A", "D", "C", "D",
                                "B", "C", "D", "B", "B",
                                "java.util*", "class", "static", "void", "main",
                                "Scanner", "new", "System.in", "double", "println",
                                "nextDouble()", "input", "resultMid", "}", "}" };
                boolean reset;

                do {
                        reset = false;
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
                                        "Enter any keys to continue........                                                                                 ");
                        NA = s.nextLine();
                        do {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println(
                                                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println(
                                                "║========------                                                                                     ------========║");
                                System.out.println(
                                                "║                                  ----===Online Midterm Examination===----                                       ║");
                                System.out.println(
                                                "║========------                                                                                     ------========║");
                                System.out.println(
                                                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                System.out.println("\n\n\nChoices:");
                                System.out.println("1. Login & Answer");
                                System.out.println("2. Exit ");
                                do {
                                        System.out.print("Enter a Number    : ");
                                        if (s.hasNextInt()) {
                                                sw = s.nextInt();
                                                Proceed = true;
                                        } else {
                                                System.out.println("Error Input Retry Again!");
                                                Proceed = false;
                                                s.next();

                                        }
                                } while (!(Proceed));
                                switch (sw) {
                                        case 1:
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
                                                System.out.println("\n\nType Your Information bellow to proceed.");
                                                System.out.print("╠> First Name   : ");
                                                Fname = s.next();
                                                System.out.print("╠> Last Name    : ");
                                                Lname = s.next();
                                                System.out.print("╠> Middle Name  : ");
                                                Mname = s.next();
                                                System.out.print("╠> LRN Number   : ");
                                                LRN = s.next();
                                                System.out.print("╠> Year Level   : ");
                                                YRL = s.next();
                                                System.out.print("╠> Course       : ");
                                                Course = s.next();
                                                System.out.print("╠> Section      : ");
                                                Sec = s.next();
                                                System.out.print("╚> Email        : ");
                                                Email = s.next();
                                                do {
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
                                                        System.out.println("    Midterm Exam    : " + score);
                                                        System.out.println("    Finalterm Exam  : " + score1);
                                                        System.out.println("    Name            : " + Fname + " "
                                                                        + Mname + ". "
                                                                        + Lname);
                                                        System.out.println("    Lrn             : " + LRN);
                                                        System.out.println("    Year/Section    : " + Course + "-" + YRL
                                                                        + Sec);
                                                        System.out.println("    Email           : " + Email);
                                                        System.out.println("\n\n\n\n\n\n\nChoices:");
                                                        System.out.println("1. Midterm Exam");
                                                        System.out.println("2. Finalterm Exam");
                                                        System.out.println("3. Go Back");
                                                        do {
                                                                System.out.print("Enter a Number : ");
                                                                if (s.hasNextInt()) {
                                                                        Y = s.nextInt();
                                                                        Proceed = true;
                                                                } else {
                                                                        System.out.println("Error Input Retry Again!");
                                                                        Proceed = false;
                                                                        s.next();

                                                                }
                                                        } while (!(Proceed));
                                                        if (Y == 1) {
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
                                                                                "Name         : " + Fname + " " + Mname
                                                                                                + ". " + Lname);
                                                                System.out.println(
                                                                                "Year/Section : " + Course + " " + YRL
                                                                                                + Sec);
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "I - Enter the correct letter for each of the following question. Enter only one letter for each item by inputing\nthe corresponding to the letter of your choice on the answer sheet provided.");
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "1. In what year did Sun Microsystem released the Java?");
                                                                System.out.println(
                                                                                "     A. 1990                                   B. 1995\n     C. 2000                                   D. 1996");
                                                                System.out.print("Answer : ");
                                                                q[0] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "2. With this feature it enables java to develop virus-free and a tamper-free systems.");
                                                                System.out.println(
                                                                                "     A. Robust                                 B. Secure\n     C. Run                                    D. Simple");
                                                                System.out.print("Answer : ");
                                                                q[1] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "3. Java can compile into different Operating system or platform like Windows, Linux, iOS, and Solaris");
                                                                System.out.println(
                                                                                "     A. Independent                            B. Platform Independent\n     C. Dependet                               D. Robust");
                                                                System.out.print("Answer : ");
                                                                q[2] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "4. Java was originally developed by __________.");
                                                                System.out.println(
                                                                                "     A. Microsoft                              B. Smart\n     C. Sun Microsystem                        D. James Gosling");
                                                                System.out.print("Answer : ");
                                                                q[3] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "5. This can be defined as a template/blueprint that describes the behavior/state of the objects.");
                                                                System.out.println(
                                                                                "     A. Class                                  B. Method\n     C. Private                                D. Public");
                                                                System.out.print("Answer : ");
                                                                q[4] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "6. Java files are stored in files suffixed with __________.");
                                                                System.out.println(
                                                                                "     A. .java                                  B. .class\n     C. .docx                                  D. .ppt");
                                                                System.out.print("Answer : ");
                                                                q[5] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "7. These files are compiled into java byte code using the java compiler, and the byste code is then executed\nusing the Java Virtual Machine.");
                                                                System.out.println(
                                                                                "     A. .java                                  B. .class\n     C. .docx                                  D. .ppt");
                                                                System.out.print("Answer : ");
                                                                q[6] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "8. Java programs that are written in the Java language are compiled into which can be executed  by the\nJava Virtual Machine.");
                                                                System.out.println(
                                                                                "     A. java bytecode                          B. java\n     C. java virtual machine                   D. .ppt");
                                                                System.out.print("Answer : ");
                                                                q[7] = s.next();
                                                                System.out.println("");
                                                                System.out.println("9. This symbol ({}) means?");
                                                                System.out.println(
                                                                                "     A. Class initializers                     B. increment\n     C. OOP                                    D. Turbo");
                                                                System.out.print("Answer : ");
                                                                q[8] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "10. Which of the following programming languages does not belong to the group?");
                                                                System.out.println(
                                                                                "     A. Java                                   B. C++\n     C. OOP                                    D. Turbo");
                                                                System.out.print("Answer : ");
                                                                q[9] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "11. Which of the following declarion of variable does not belong to the group?");
                                                                System.out.println(
                                                                                "     A. int myNumber = 10;                     B. byte a = 55;\n     C. String fname = Mark;                   D. double x = \"2.2\";");
                                                                System.out.print("Answer : ");
                                                                q[10] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "12. Which of the following programming software does not belong?");
                                                                System.out.println(
                                                                                "     A. Jcreator                               B. VB10\n     C. MS Word                                D. Dev C++");
                                                                System.out.print("Answer : ");
                                                                q[11] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "13. A primitive data type that accepts decimal points.");
                                                                System.out.println(
                                                                                "     A. double                                 B. byte\n     C. Long                                   D. string");
                                                                System.out.print("Answer : ");
                                                                q[12] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "14. A primitive data type that ranges -128 to 127 know as?");
                                                                System.out.println(
                                                                                "     A. double                                 B. byte\n     C. long                                   D. string");
                                                                System.out.print("Answer : ");
                                                                q[13] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "15. Variables are typically user to __________ information which your Java program needs to do its job.");
                                                                System.out.println(
                                                                                "     A. store                                  B. process\n     C. classify                               D. check");
                                                                System.out.print("Answer : ");
                                                                q[14] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "16. A piece of memory that can contain a data and value.");
                                                                System.out.println(
                                                                                "     A. data type                              B. class name\n     C. value                                  D. variable");
                                                                System.out.print("Answer : ");
                                                                q[15] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "17. The Value 20.68 can be held by a variable of type __________.");
                                                                System.out.println(
                                                                                "     A. int                                    B. boolean\n     C. double                                 D. String");
                                                                System.out.print("Answer : ");
                                                                q[16] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "18. A Boolean variable can hold __________.");
                                                                System.out.println(
                                                                                "     A. any character                          B. any decimal number\n     C. any whole number                       D. the values true or false");
                                                                System.out.print("Answer : ");
                                                                q[17] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "19. When data cannot be changed after a class is compiled, the data is __________.");
                                                                System.out.println(
                                                                                "     A. constant                               B. variable\n     C. volatile                               D. mutable");
                                                                System.out.print("Answer : ");
                                                                q[18] = s.next();
                                                                System.out.println("");
                                                                System.out
                                                                                .println("20. All Java application programm must have a method named __________.");
                                                                System.out.println(
                                                                                "     A. method()                               B. java()\n     C. Hello()                                D. main()");
                                                                System.out.print("Answer : ");
                                                                q[19] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "21. Which of the following is not a primitive data type in Java?");
                                                                System.out.println(
                                                                                "     A. boolean                                B. byte\n     C. int                                    D. sector");
                                                                System.out.print("Answer : ");
                                                                q[20] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "22. The value \"0938 Quezon Street\" can be held by a variablt of type __________.");
                                                                System.out.println(
                                                                                "     A. int                                    B. boolean\n     C. double                                 D. String");
                                                                System.out.print("Answer : ");
                                                                q[21] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "23. Assuming you declared studAge to be a variable of type int, which of the following is a valid\nassignment in Java?");
                                                                System.out.println(
                                                                                "     A. studage = 9;                           B. studAge = 9.5;\n     C. studAge = '9';                         D. studAge = \"nine\";");
                                                                System.out.print("Answer : ");
                                                                q[22] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "24. Which of the following data types can store a value in the least ammount of memory?");
                                                                System.out.println(
                                                                                "     A. short                                  B. long\n     C. int                                    D. byte");
                                                                System.out.print("Answer : ");
                                                                q[23] = s.next();
                                                                System.out.println("");
                                                                System.out.println("25. A code used to print a text.");
                                                                System.out.println(
                                                                                "     A. system.out.println(Welcome to java);   B. System.out.println(\"Welcome to java\")\n     C. System.out.println(\"Welcome to java\"); D. system.out.println(Welcome to java)");
                                                                System.out.print("Answer : ");
                                                                q[24] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "26. A Primitive data type ranges -32,768 to 32,767 knowns as?");
                                                                System.out.println(
                                                                                "     A. int                                    B. byte\n     C. boolean                                D. short");
                                                                System.out.print("Answer : ");
                                                                q[25] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "27. Which of the following command key is used to run java program.");
                                                                System.out.println(
                                                                                "     A. F1                                     B. F4\n     C. F5                                     D. F6");
                                                                System.out.print("Answer : ");
                                                                q[26] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "28. He developed Java programming.");
                                                                System.out.println(
                                                                                "     A. Mark Zuckerberg                        B. James Gosling\n     C. Bill Gates                             D. Steve Jobs");
                                                                System.out.print("Answer : ");
                                                                q[27] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "29. System.out.println(200-(-10)) What does it print?");
                                                                System.out.println(
                                                                                "     A. 210                                    B. 180\n     C. -200                                   D. -210");
                                                                System.out.print("Answer : ");
                                                                q[28] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "30. A field of variable that belongs to an instance or object.");
                                                                System.out.println(
                                                                                "     A. static                                 B. non-static\n     C. parameter                              D. local");
                                                                System.out.print("Answer : ");
                                                                q[29] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "31. The increment operator adds one of the integer value.");
                                                                System.out.println(
                                                                                "     A. <=                                     B. {}\n     C. ++                                     D. --");
                                                                System.out.print("Answer : ");
                                                                q[30] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "32. A comman key used to execture java program in JCreator.");
                                                                System.out.println(
                                                                                "     A. F1                                     B. F4\n     C. F5                                     D. F6");
                                                                System.out.print("Answer : ");
                                                                q[31] = s.next();

                                                                System.out.println("");
                                                                System.out.println(
                                                                                "33. Which of the following is correct in declaring a variable.");
                                                                System.out.println(
                                                                                "     A. long a = \"java\"                        B. int 24cute = 1\n     C. String fname = 23;                     D. double xline = 5.20;");
                                                                System.out.print("Answer : ");
                                                                q[32] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "34. In proper naming this syntax, first letter of the name/identifier should be written in an\nupper case format.");
                                                                System.out.println(
                                                                                "     A. method name                            B. class name\n     C. file name                              D. keyword");
                                                                System.out.print("Answer : ");
                                                                q[33] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "35. A syntax used for naming a variable.");
                                                                System.out.println(
                                                                                "     A. method name                            B. class name\n     C. file name                              D. variable name");
                                                                System.out.print("Answer : ");
                                                                q[34] = s.next();
                                                                System.out.println("");
                                                                System.out.println("36. A symbol used for comments.");
                                                                System.out.println(
                                                                                "     A. <=                                     B. /* */\n     C. {}                                     D. -");
                                                                System.out.print("Answer : ");
                                                                q[35] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "37. A sequence of Java instructions that are executed in a certain order.");
                                                                System.out.println(
                                                                                "     A. main method                            B. class name\n     C. file name                              D. method name");
                                                                System.out.print("Answer : ");
                                                                q[36] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "38. Each variable has a __________.");
                                                                System.out.println(
                                                                                "     A. unique character                       B. indentifier\n     C. value                                  D. data type");
                                                                System.out.print("Answer : ");
                                                                q[37] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "39. Which of the folling does not consifered a Keyword.");
                                                                System.out.println(
                                                                                "     A. static                                 B. void\n     C. find                                   D. public");
                                                                System.out.print("Answer : ");
                                                                q[38] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "40. Which of the following conditional operator does not belong?");
                                                                System.out.println(
                                                                                "     A. <=                                     B. ==\n     C. !=                                     D. =>");
                                                                System.out.print("Answer : ");
                                                                q[39] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "41. In Java, whar uis the value of 3 + 7 * 4 + 2?");
                                                                System.out.println(
                                                                                "     A. 21                                     B. 33\n     C. 42                                     D. 48");
                                                                System.out.print("Answer : ");
                                                                q[40] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "42. All java programming statements must end with a __________.");
                                                                System.out.println(
                                                                                "     A. Period                                 B. comma\n     C. semicolon                              D. closing parathesis");
                                                                System.out.print("Answer : ");
                                                                q[41] = s.next();
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "43. Which of the following escape characters does not belong?");
                                                                System.out.println(
                                                                                "     A. \\t                                     B. \\n\n     C. \\r                                     D. \\s");
                                                                System.out.print("Answer : ");
                                                                q[42] = s.next();
                                                                System.out.println("");
                                                                System.out.println("44. (5 + 4 < && 7 + 3 <= 20).");
                                                                System.out.println(
                                                                                "     A. true                                   B. false");
                                                                System.out.print("Answer : ");
                                                                q[43] = s.next();
                                                                System.out.println("");
                                                                System.out.println("45. (!(7==7))");
                                                                System.out.println(
                                                                                "     A. true                                   B. false");
                                                                System.out.print("Answer : ");
                                                                q[44] = s.next();

                                                                System.out.println(
                                                                                "\n\nTEST II\n Direction: Identify and fill the missing element/codes to complete the program.\n");
                                                                System.out.println("import (1)________;");
                                                                System.out.println(
                                                                                "public (2)________ GradingSystem {");
                                                                System.out.println(
                                                                                "    public (3)________ (4)________ (5)________(String[] args) {");
                                                                System.out.println(
                                                                                "    (6)________ input = (7)________ Scanner ((8)________);");
                                                                System.out.println("    double midGrade = 0.4;");
                                                                System.out.println("    (9)________ finalGrade = 0.6;");
                                                                System.out.println(
                                                                                "    double midUser, finalUser, finalResult, resultMid, resultFinal;");
                                                                System.out.println(
                                                                                "    System.out.(10)________(\"Enter your midterm grade: \");");
                                                                System.out.println("    midUser = input.(11)________;");
                                                                System.out.println(
                                                                                "    resultMid = mdUser * midGrade;\n\n");
                                                                System.out.println(
                                                                                "    System.out.println(\"Enter your finalterm grade: \");");
                                                                System.out.println(
                                                                                "    finalUser = (12)________.nextDouble();");
                                                                System.out.println(
                                                                                "    resultFinal = finalUser * finalGrade;\n\n");
                                                                System.out.println(
                                                                                "    finaResult = (13)________ * resultFinal;");
                                                                System.out.println(
                                                                                "    System.out.println(\"Your final rating is\" + Math.roung(finalResult));");
                                                                System.out.println("    }");
                                                                System.out.println("}");

                                                                System.out.print("1. ");
                                                                q[45] = s.next();
                                                                System.out.print("2. ");
                                                                q[46] = s.next();
                                                                System.out.print("3. ");
                                                                q[47] = s.next();
                                                                System.out.print("4. ");
                                                                q[48] = s.next();
                                                                System.out.print("5. ");
                                                                q[49] = s.next();
                                                                System.out.print("6. ");
                                                                q[50] = s.next();
                                                                System.out.print("7. ");
                                                                q[51] = s.next();
                                                                System.out.print("8. ");
                                                                q[52] = s.next();
                                                                System.out.print("9. ");
                                                                q[53] = s.next();
                                                                System.out.print("10. ");
                                                                q[54] = s.next();
                                                                System.out.print("11. ");
                                                                q[55] = s.next();
                                                                System.out.print("12. ");
                                                                q[56] = s.next();
                                                                System.out.print("13. ");
                                                                q[57] = s.next();
                                                                System.out.print("14. ");
                                                                q[58] = s.next();
                                                                System.out.print("15. ");
                                                                q[59] = s.next();
                                                                for (int i = 0; i < q.length; i++) {
                                                                        if (q[i].equalsIgnoreCase(ans[i])) {
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
                                                                                "║                                       ----===Midterm Exam Score===----                                          ║");
                                                                System.out.println(
                                                                                "║========------                                                                                     ------========║");
                                                                System.out.println(
                                                                                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                                                System.out.println("\n\n");
                                                                System.out.println(
                                                                                "Your Midterm Exam Score is " + score
                                                                                                + "/60");
                                                                System.out.println(
                                                                                "Thanks for Answering the Exam Mr/s. "
                                                                                                + Fname + " " + Mname
                                                                                                + ". " + Lname);
                                                                System.out.println("\nPrepared BY:\n");
                                                                System.out.println("MARIA REGINA C. FLORES");
                                                                System.out.println("Part-Time Instructor");
                                                                System.out.println("\nLEIZA LINDAL. PELAYO, MAITE");
                                                                System.out.println("Instructor 1");
                                                                System.out.println(
                                                                                "\n\nWould you wish to see your all answers & correct/incorrect ");
                                                                System.out.print("Enter Yes/Y: ");
                                                                dasd = s.next();
                                                                if (dasd.equalsIgnoreCase("Yes")
                                                                                || dasd.equalsIgnoreCase("Y")) {
                                                                        System.out.print("\n\n\nCorrect and Mistakes");
                                                                        for (int i = 0; i < q.length; i++) {
                                                                                System.out.print(a + ". " + q[i]);
                                                                                a++;
                                                                                if (!q[i].equalsIgnoreCase(ans[i])) {
                                                                                        System.out.println(
                                                                                                        " Incorrect");
                                                                                } else {
                                                                                        System.out.println(" Correct");
                                                                                }
                                                                        }
                                                                }
                                                                do {
                                                                        System.out.print("Enter 1 to go back :");
                                                                        if (s.hasNextInt()) {
                                                                                System.out.print("\033[H\033[2J");
                                                                                System.out.flush();
                                                                                yes1 = s.nextInt();
                                                                                Proceed = true;
                                                                        } else {
                                                                                System.out.println(
                                                                                                "Error Input Retry Again!");
                                                                                Proceed = false;
                                                                                s.next();
                                                                        }
                                                                } while (!(Proceed));
                                                        } else if (Y == 2) {
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.flush();
                                                                System.out.println("Finalterm Exam is Unavailabe");
                                                                do {
                                                                        System.out.print("Enter 1 to go back :");
                                                                        if (s.hasNextInt()) {
                                                                                System.out.print("\033[H\033[2J");
                                                                                System.out.flush();
                                                                                yes1 = s.nextInt();
                                                                                Proceed = true;
                                                                        } else {
                                                                                System.out.println(
                                                                                                "Error Input Retry Again!");
                                                                                Proceed = false;
                                                                                s.next();

                                                                        }
                                                                } while (!(Proceed));

                                                        } else if (Y == 3) {
                                                                yes1 = 3;
                                                        }
                                                } while (yes1 == 1);
                                                break;
                                        case 2:
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                System.out.println(
                                                                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                                System.out.println(
                                                                "║========------                                                                                     ------========║");
                                                System.out.println(
                                                                "║                                  ----===Thanks for using our program===----                                     ║");
                                                System.out.println(
                                                                "║========------                                                                                     ------========║");
                                                System.out.println(
                                                                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                                System.out.println(
                                                                "                                        Click anywhere to continue");

                                                NA = s.nextLine();
                                                reset = true;
                                                break;
                                        default:
                                                System.out.print("Failed please try again enter 1");
                                                Yes = s.nextInt();
                                                Yes = s.nextInt();
                                                Yes = s.nextInt();
                                }
                        } while (Yes == 1 || Y == 3 || yes1 == 3);
                } while (reset);
        }
}