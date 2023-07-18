/* Java program to find the area of a triangle whose three sides are given */

import java.util.Scanner;

public class AreaTriangle3Sides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Side: ");
        int s1 = scanner.nextInt();
        System.out.println("Enter 2nd Side: ");
        int s2 = scanner.nextInt();
        System.out.println("Enter 3rd Side: ");
        int s3 = scanner.nextInt();

        scanner.close();
        if ((s1 + s2) > s3 && (s2 + s3) > s1 && (s3 + s1) > s2) {
            double s = (s1 + s2 + s3) / 2;

            double area = Math.sqrt(s * (s - s1) + s * (s - s2) + s * (s - s3));
            System.out.println("Area of Triangle is: " + area);

        } else {
            System.out.println("Not a Triangle");
        }
    }
}
