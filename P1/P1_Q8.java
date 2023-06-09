import java.util.*;
public class P1_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input m: ");
        int m = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n]; //creates 2d array
        int twoDigit = 0;
        System.out.println("Input values in 2D array: ");
        for (int i = 0; i < a.length; i++) { //takes input for array elements
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int r = 0; r < a.length; r++) { //finds number of 2 digit elements
            for (int c = 0; c < a[0].length; c++) {
                if ((a[r][c] > 9) && (a[r][c] < 100)) {
                    twoDigit++;
                }
            }
        }
        for (int rp = 0; rp < a.length; rp++) { //prints matrix
            for (int cp = 0; cp < a[0].length; cp++) {
                System.out.print(a[rp][cp]+"\t");
            }
            System.out.println();
        }
        System.out.println("Number of two digit numbers: "+twoDigit);
    }
}