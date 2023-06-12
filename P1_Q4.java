import java.util.*;
public class P1_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creating scanner object
        double[] a = new double[15];
        int category1 = 0; //students with marks less than 40
        int category2 = 0; //students with marks between 40 and 59
        int category3 = 0; //students with marks between 60 and 80
        int category4 = 0; //students with marks greater than 80
        System.out.println("Input marks of 15 students: ");
        for (int i = 0; i < 15; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < 15; j++) {
            if (a[j] < 40) category1++;
            else if (a[j] >= 40 && a[j] < 60) category2++;
            else if (a[j] >= 60 && a[j] < 81) category3++;
            else category4++;
        }
        System.out.println("Students with marks less than 40: "+category1);
        System.out.println("Students with marks between 40 and 59: "+category2);
        System.out.println("Students with marks between 60 and 80: "+category3);
        System.out.println("Students with marks greater than 80: "+category4);
    }
}