import java.util.*;
public class P1_Q2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creates scanner object
        System.out.println("Input n: ");
        int n = sc.nextInt(); //takes input for number of lines
        flyod_Triangle(n);
    }

    static void flyod_Triangle(int n) { //method to make and print pattern
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x+"\t");
                x++;
            }
            System.out.println();
        }
    }
}