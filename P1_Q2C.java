import java.util.*;
public class P1_Q2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        flyod_Triangle(n);
    }

    static void flyod_Triangle(int n) {
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