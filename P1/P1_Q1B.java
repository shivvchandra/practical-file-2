import java.util.*;
public class P1_Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        double result = sumSeries(a, n);
        System.out.println("Sum of series is: " + result); //prints results
    }

    static double sumSeries(int a, int n) { //method to calculate sum of series
        double factI = 1;
        double s = 0;
        for (double i = 1; i <= n; i+=1) {
            for (double j = 1; j <= i; j+=1) {
                factI = factI * j;
            }
            s = s + ((Math.pow(a,i)) / factI );
            factI = 1;
        }
        return s; //sends value of sum to main method
    }
}