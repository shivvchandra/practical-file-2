import java.util.*;
public class P1_Q3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Type 1 for Perfect Square check, Type 2 for Automorphic check");
        int choice = sc.nextInt(); //takes input of user choice
        switch (choice) { //menu for user choice
            case 1:
                System.out.println("You selected Perfect Square check.\nInput number:");
                double n = sc.nextInt();
                if (check(n)) System.out.println("Number is a Perfect Square");
                else System.out.println("Number is not a Perfect Square");
                break;
            case 2:
                System.out.println("You selected Automorphic check.\nInput number:");
                n = sc.nextInt();
                n = (int)n;
                if (check(n)) System.out.println("Number is Automorphic");
                else System.out.println("Number is not Automorphic");
                break;
            default:
                System.out.println("You did not type 1 or 2. Invalid Input");
        }
    }
    static boolean check(double n) { //method to check if number is perfect square
        if (n >= 0) {
            int sqrt = (int)Math.sqrt(n);
            return ((sqrt * sqrt) == n);
        }
        else {
            return false; //sends boolean result to main method
        }
    }
    static boolean check(int n) { //method to check automorphic number
        int square = n * n;
        if (n%10 != square%10) {
            return false;
        }
        n = n/10;
        square = square/10;
        return true; //sends boolean result to main method
    }
}