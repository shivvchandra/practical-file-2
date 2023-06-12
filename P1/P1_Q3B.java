import java.util.*;
public class P1_Q3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for Perfect Square check, Type 2 for Automorphic check");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Perfect Square check.\nInput number:");
                double n = sc.nextInt();
                if (check(n)) System.out.println("Number is a Perfect Square");
                else System.out.println("Number is not a Perfect Square");
                return;
            case 2:
                System.out.println("You selected Automorphic check.\nInput number:");
                n = sc.nextInt();
                n = (int)n;
                if (check(n)) System.out.println("Number is Automorphic");
                else System.out.println("Number is not Automorphic");
                return;
            default:
                System.out.println("You did not type 1 or 2. Invalid Input");
        }
    }
    static boolean check(double n) {
        if (n >= 0) {
            int sqrt = (int)Math.sqrt(n);
            return ((sqrt * sqrt) == n);
        }
        else {
            return false;
        }
    }
    static boolean check(int n) {
        int square = n * n;
        if (n%10 != square%10) {
            return false;
        }
        n = n/10;
        square = square/10;
        return true;
    }
}