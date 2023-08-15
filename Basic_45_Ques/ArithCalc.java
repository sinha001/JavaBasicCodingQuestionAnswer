/*
 * WAP to create the equivalent of a four-function calculator. 
 * The Program requires the user to enter 2 numbers and an operator as arguments.
 * It then carries out the specified arithmetical operation: Addition, Subtraction, Multiplication, Division, Modulous. 
 * Finally Display the result...
 */

import java.util.Scanner;

public class ArithCalc {

    public static double Calculator(double n1, double n2, char opera) {
        double res = 0;
        if (opera == '+') {
            return n1 + n2;
        } else if (opera == '-') {
            if (n1 > n2)
                return n1 - n2;
            return n2 - n1;
        } else if (opera == '/') {
            res = n1 / n2;
        } else if (opera == '*') {
            return n1 * n2;
        } else if (opera == '%') {
            res = n1 % n2;
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Positive Numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Enter the operator (+, -, /, *, %): ");
        char opera = sc.next().charAt(0);

        if (opera == '+') {
            System.out.println("Addition of " + a + " & " + b + " is = " + Calculator(a, b, opera));
        } else if (opera == '-') {
            System.out.println("Subtraction of " + a + " & " + b + " is = " + Calculator(a, b, opera));
        } else if (opera == '*') {
            System.out.println("Multiplication of " + a + " & " + b + " is = " + Calculator(a, b, opera));
        } else if (opera == '/') {
            System.out.println("Division of " + a + " & " + b + " is = " + Calculator(a, b, opera));
        } else if (opera == '%') {
            System.out.println("Modulous of " + a + " & " + b + " is = " + Calculator(a, b, opera));
        } else {
            System.out.println("Wrong CHoice!!");
        }
    }

}
