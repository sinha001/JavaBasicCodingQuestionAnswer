
/*
 * WAP to accept 2 numbers and list their properties of the following manner..
 * 1. whether the number is a natural, or whole number or an integer.
 * 2. whether the number is even or odd.
 * 3. whether the number is negative or positive..
 * 4. whether the two numbers have equal absolution value.
 */
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > 0) {
            if (n1 % 2 == 0) {
                System.out.println("First Number is " + n1 + " : natural, even, positive integer");
            } else {
                System.out.println("First Number is " + n1 + " : natural, odd, positive integer");
            }
        } else if (n1 < 0) {
            if (n1 % 2 == 0) {
                System.out.println("First Number is " + n1 + " : natural, even, negative integer");
            } else {
                System.out.println("First Number is " + n1 + " : natural, odd, negatuve integer");
            }
        } else {
            System.out.println("First number is " + n1 + " : whole number, zero");
        }

        if (n2 > 0) {
            if (n2 % 2 == 0) {
                System.out.println("Second Number is " + n2 + " : natural, even, positive integer");
            } else {
                System.out.println("Second Number is " + n2 + " : natural, odd, positive integer");
            }
        } else if (n2 < 0) {
            if (n2 % 2 == 0) {
                System.out.println("Second Number is " + n2 + " : natural, even, negative integer");
            } else {
                System.out.println("Second Number is " + n2 + " : natural, odd, negatuve integer");
            }
        } else {
            System.out.println("Second number is " + n2 + " : whole number, zero");
        }
        if (Math.abs(n1) > Math.abs(n2)) {
            System.out.println("First number has higher absolute value than second number");
        } else if (Math.abs(n1) < Math.abs(n2)) {
            System.out.println("First number has lower absolute value than second number");
        } else {
            System.out.println("Both First number and second number has same absolute value");
        }
    }

}
