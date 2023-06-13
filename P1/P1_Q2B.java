import java.util.*;
public class P1_Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input n: ");
        int n = sc.nextInt(); //takes input for number of lines
        printPattern_2(n);
    }

    static void printPattern_2(int n) { //method to make and print pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                char ch = (char)('A' + (j * 2));
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}