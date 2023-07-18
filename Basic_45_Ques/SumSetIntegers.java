/* Java program to find out the average of a set of integers */

import java.util.Scanner;

public class SumSetIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers to calculate: ");
        int c = sc.nextInt();
        System.out.println("Enter the number: ");
        int sum = 0;
        for (int i = 0; i < c; i++) {

            int n = sc.nextInt();
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + j;
            }

        }
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
