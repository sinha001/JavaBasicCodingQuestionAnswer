/* Java program to convert the temperature in Centigrade to Fahrenheit */

import java.util.Scanner;

public class CentiToFahren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the centigrate: ");
        int cent = scanner.nextInt();
        scanner.close();
        float f = ((9f * cent) / 5f) + 32;

        System.out.println("In Fahrenheit: " + f);

    }
}
