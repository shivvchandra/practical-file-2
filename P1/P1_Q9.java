import java.util.*;
public class P1_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input m: ");
        int m = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Input values in 2D array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int max = a[0][0];
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[0].length; c++) {
                if(a[r][c] > max) {
                    max = a[r][c];
                }
            }
        }
        System.out.println("The largest number in 2D array is "+max);
    }
}