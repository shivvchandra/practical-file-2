import java.util.*;
public class P1_Q1B {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        double result = sumSeries(a, n);
        System.out.println("Sum of series is: " + result);
    }

    static double sumSeries(int a, int n) {
        double factI = 1;
        double s = 0;
        for (double i = 1; i <= n; i+=1) {
            for (double j = 1; j <= i; j+=1) {
                factI = factI * j;
            }
            s = s + ((Math.pow(a,i)) / factI );
            factI = 1;
        }
        return s;
    }
}