import java.util.*;
public class P1_Q3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println("Input p: ");
        int p = sc.nextInt();
        System.out.println("Input c: ");
        char c = sc.next().charAt(1);
        int result = digitExtraction(n, p, c);
        System.out.println(result);
    }
     static int digitExtraction(int n) {
        int d;
        d = n % 10;
        return d;
     }
    static int digitExtraction(int n, int p) {
        int dp = 0;
        for (int i = 1; i <= p; i++) {
            dp = n%10;
            n = n/10;
        }
        return dp;
    }
    static int digitExtraction(int n, int p, char c) {
        int dc = 0;
        if (c == 'R') {
            dc = n%10;
        }
        else {
            while (n != 0) {
                dc = n%10;
                n = n/10;
            }
        }
        return dc;
    }
}