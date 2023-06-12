import java.util.*;
public class P1_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Input numbers of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int j = 0; j < n; j++) {
            if (a[j] < min) min = a[j];
        }
        int min2 = a[0];
        for (int k = 0; k < n; k++) {
            if ((a[k] < min2) && (a[k] != min)) {
                min2 = a[k];
            }
        }
        System.out.println("Second smallest element is: "+min2);
    }
}