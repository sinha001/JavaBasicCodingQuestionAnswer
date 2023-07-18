/* Java program to find the product of a set of real numbers */

import java.util.Scanner;

public class ProductOfRealNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numner of real numbers to test : ");
        int c = sc.nextInt();

        System.out.println("Enter the " + c + " real number ");
        float pro = 1.0f;

        for (int i = 0; i < c; i++) {
            pro = pro * sc.nextFloat();
        }

        sc.close();
        System.out.println("The product of the real numbers is : " + pro);
    }

}
