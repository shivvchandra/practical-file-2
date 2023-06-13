import java.util.*;
public class P1_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        double[] a = new double[15];
        double heightSum = 0;
        System.out.println("Input height of 10 students (in cm): ");
        for (int i = 0; i < 10; i++) { //takes input of height in array
            a[i] = sc.nextInt();
            heightSum += a[i];
        }
        double min = a[0];
        double max = 0;
        for (int j = 0; j < 10; j++) { //finds min and max height
            if (a[j] < min) min = a[j];
            if (a[j] > max) max = a[j];
        }
        System.out.println("Minimum height: "+min+"cm");
        System.out.println("Maximum height: "+max+"cm");
        System.out.println("Mean height: "+heightSum/10+"cm");
    }
}