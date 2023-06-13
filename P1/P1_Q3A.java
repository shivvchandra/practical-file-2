import java.util.*;
public class P1_Q3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        int n;
        int p;
        char c;
        System.out.println("Input 1 to extract rightmost digit: ");
        System.out.println("Input 2 to extract digit present at place P starting from right: ");
        System.out.println("Input 3 to extract rightmost/leftmost digit: ");
        int choice = sc.nextInt(); //takes input of user choice
        switch (choice) { //menu for user choice
            case 1:
                System.out.println("You chose 1. Input number: ");
                n = sc.nextInt();
                System.out.println("Rightmost digit: "+digitExtraction(n));
                break;
            case 2:
                System.out.println("You chose 2. Input number: ");
                n = sc.nextInt();
                System.out.println("Input P: ");
                p = sc.nextInt();
                System.out.println("Digit at "+p+" position from right: "+digitExtraction(n,p));
                break;
            case 3:
                System.out.println("You chose 3. Input number: ");
                n = sc.nextInt();
                System.out.println("Input 'R' for rightmost digit, Input anything else for leftmost: ");
                c = sc.next().charAt(1);
                System.out.println("Digit is: "+digitExtraction(n,c));
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
     static int digitExtraction(int n) { //method for rightmost digit extraction
        int d;
        d = n % 10;
        return d; //sends value of digit to main method
     }
    static int digitExtraction(int n, int p) { //method for extraction of Pth digit from right
        int dp = 0;
        for (int i = 1; i <= p; i++) {
            dp = n%10;
            n = n/10;
        }
        return dp; //sends value of digit to main method
    }
    static int digitExtraction(int n, char c) { //method for extraction for rightmost/leftmost digit
        int dc = 0;
        if (c == 'R' || c == 'r') {
            dc = n%10;
        }
        else {
            while (n != 0) {
                dc = n%10;
                n = n/10;
            }
        }
        return dc; //sends value of digit to main method
    }
}