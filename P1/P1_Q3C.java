import java.util.*;
public class P1_Q3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find the sum of smallest digit of 3 numbers: ");
        System.out.println("Enter 2 to find the smallest digit of a number: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose 1. Input 3 numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println("Sum of smallest digits is: "+addSmallest(a,b,c));
                return;
            case 2:
                System.out.println("You chose 2. Input a number:");
                int n = sc.nextInt();
                System.out.println("Smallest Digit is: "+smallest(n));
                return;
            default:
                System.out.println("Invalid Input!");
                return;
        }
    }

    static int addSmallest(int a, int b, int c) {
        int smallestA = smallest(a);
        int smallestB = smallest(b);
        int smallestC = smallest(c);
        return smallestA + smallestB + smallestC;
    }
    static int smallest(int n) {
        int d;
        int s = n%10;
        while (n > 0) {
            d = n % 10;
            n = n / 10;
            if (d < s) {
                s = d;
            }
        }
        return s;
    }
}