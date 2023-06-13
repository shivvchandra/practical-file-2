import java.util.*;
public class P1_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n]; //main array
        int[] ar = new int[n]; //reversed array
        int c = 0;
        System.out.println("Input numbers of array: ");
        for (int i = 0; i < n; i++) { //takes input for elements of array
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) { //reverses numbers to ar[] array
            ar[j] = reverse(a[j]);
        }
        for (int k = 0; k < n; k++) { //prints 3 elements per line
            System.out.print(ar[k]+" ");
            c++;
            if (c%3 == 0) {
                System.out.println();
            }
        }
    }
    static int reverse(int n) { //method to reverse number
        int d;
        int r = 0;
        while (n > 0) {
            d = n%10;
            n = n/10;
            r = (r*10) + d;
        }
        return r;
    }
}