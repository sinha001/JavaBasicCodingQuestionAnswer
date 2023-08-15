
/*
 * WAP to enter year and display number of days in it while mentioning 
 * whether it is common year, leap year, common century-year, & leap century-year.. 
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year : ");
        int year = sc.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("It is a leap century-year containing 366 days.");
            } else {
                System.out.println("It is a common century-year containing 365 days.");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("It is a leap year containing 366 days.");
            } else {
                System.out.println("It is common year containing 365 days.");
            }
        }
    }

}
