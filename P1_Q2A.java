import java.util.*;
public class P1_Q2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        printPattern_1(n);
    }

    static void printPattern_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}