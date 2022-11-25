package Java.Basics;

import java.util.Scanner;

//Switch Statement
public class Switch {
    public static void main(String[] args) {

        int grade = 1;

        switch (grade) {
            case 1:
                System.out.println("asd");
                break;
            case 2:
                System.out.println("dsa");
                break;
            default:
                System.out.println("Failed");
        }

        Scanner s = new Scanner(System.in);

        System.out.println("Month :");
        int Month = s.nextInt();

        System.out.println("Month :");
        int Date = s.nextInt();

        System.out.println("Month :");
        int Year = s.nextInt();

        String Months = "";

        switch (Month) {
            case 1:
                Months = "January";
                break;
            case 2:
                Months = "Febuary";
                break;
            case 3:
                Months = "March";
                break;
            case 4:
                Months = "April";
                break;
            case 5:
                Months = "May";
                break;
            case 6:
                Months = "June";
                break;
            case 7:
                Months = "July";
                break;
            case 8:
                Months = "August";
                break;
            case 9:
                Months = "September";
                break;
            case 10:
                Months = "October";
                break;
            case 11:
                Months = "November";
                break;
            case 12:
                Months = "December";
                break;
            // default:
            // System.out.println("Invalid");
        }
        System.out.println();

        if (Months == "") {
            System.out.println("Ivalid Month");
        } else {
            if (Date > 31 || Date <= 0) {
                System.out.println("Invalid Date");
            } else {
                System.out.println(Months + " " + Date + " " + Year);
            }
        }
        // if (Date > 31 || Date <= 0){
        // System.out.println("Invalid Date");
        // }else{
        // System.out.println(Months + " " + Date + " " + Year);
        // }
    }
}
