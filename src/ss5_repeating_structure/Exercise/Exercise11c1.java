package ss5_repeating_structure.Exercise;

/**
 * Viết chương trình tính:
 * <p>
 * S = 1+1/3!+1/5!+…..+1/(2n-1)!
 * <p>
 * Số n được nhập từ bàn phím
 */
import java.util.Scanner;

public class Exercise11c1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n! = n * (n-1) * (n - 2).... * 2 * 1

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        double S = 0.0;

        // n = 3 => 1/1 + 1/3! + 1/5!
        for (int i = 1; i <= n; i++) { // i = 2
            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) { // 3 <= 3
                fact *= j; // fact = fact * j; //fact = 6 = 3!
            }
            S += 1.0 / fact; // 1.0/1 = 1 => S = 1 + 1.0/6
        }
        System.out.println("S = " + S);
    }
}