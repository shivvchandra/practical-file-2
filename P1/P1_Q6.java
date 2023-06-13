import java.util.*;
public class P1_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input size of array: ");
        int n = sc.nextInt(); //takes input for array size
        int[] a = new int[n];
        System.out.println("Input numbers of array: ");
        for (int i = 0; i < n; i++) { //takes input for array elements
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int j = 0; j < n; j++) { //finds smallest element
            if (a[j] < min) min = a[j];
        }
        int min2 = a[0];
        for (int k = 0; k < n; k++) { //finds 2nd smallest element
            if ((a[k] < min2) && (a[k] != min)) {
                min2 = a[k];
            }
        }
        System.out.println("Second smallest element is: "+min2);
    }
}