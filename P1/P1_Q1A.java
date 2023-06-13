import java.util.*;
public class P1_Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println("Input x: ");
        int x = sc.nextInt();
        System.out.println("Sum of series is: "+sumSeries(x,n)); //prints results
    }
    static double sumSeries(int x, int n) { //method to calculate sum of series
        double s = Math.pow(2,x);
        double next;
        for (int i = 1; i <= n; i++) {
            next = Math.pow(2,x-i)/(i+1);
            s += next;
        }
        return s; //sends value of sum to main method
    }
}