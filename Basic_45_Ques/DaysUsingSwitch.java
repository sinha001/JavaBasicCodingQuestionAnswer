
/*
 * WAP to input number of week's day (1-7) and translate to its equivalent name of the day of the week.
 * eg. 1 to Sunday, 2 to Monday,...., 7 to Saturday
 */
import java.util.Scanner;

public class DaysUsingSwitch {

    public static void WeekDays(int days) {
        String ans;
        switch (days) {
            case 1:
                ans = "Sunday";
                break;
            case 2:
                ans = "Monday";
                break;
            case 3:
                ans = "Tuesday";
                break;
            case 4:
                ans = "Wednesday";
                break;
            case 5:
                ans = "Thrusday";
                break;
            case 6:
                ans = "Friday";
                break;
            case 7:
                ans = "Saturday";
                break;
            default:
                ans = "Wrong day number!!!";

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day : ");
        int days = sc.nextInt();
        WeekDays(days);
    }

}
