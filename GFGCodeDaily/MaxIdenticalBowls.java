/*  Maximum Identical Bowls
 * 
 * There are N bowls containing cookies. In one operation, you can take one cookie from any of the non-empty bowls and put it into another bowl. 
 * If the bowl becomes empty you discard it. You can perform the above operation any number of times. You want to know the maximum number of 
   bowls you can have with an identical number of cookies.

Note: All the non-discarded bowls should contain the identical number of cookies.
 */

import java.util.Scanner;

class MaxIdenticalBowls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        System.out.printf("Enter the %d nummber of elements : \n", num);
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Maximum Identical Bowls are : " + maxIdentBowls(num, arr));
    }

    public static int maxIdentBowls(int n, int arr[]) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = n; i >= 1; i--) {
            if (sum % i == 0)
                return i;
        }
        return 0;
    }

}