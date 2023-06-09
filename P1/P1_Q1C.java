import java.util.*;
public class P1_Q1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input n: ");
        int n = sc.nextInt();
        double result = sumSeries(n);
        System.out.println("Sum of series is: " + result); //prints results
    }

    static double sumSeries(int n) { //method to calculate sum of series
        double s = 0;
        for (double i = 2; i < n; i+=2) {
            if (i % 4 == 0) {
                s = s + i;
            }
            else {
                s = s - i;
            }
        }
        return s; //sends value of sum to main method
    }
}