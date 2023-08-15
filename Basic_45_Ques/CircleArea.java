import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        double area = 3.14159 * radius * radius;

        System.out.println("The Area of Triange is : " + area);
    }

}
