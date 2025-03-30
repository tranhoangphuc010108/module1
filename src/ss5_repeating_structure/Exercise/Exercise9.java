package ss5_repeating_structure.Exercise;

/**
 * In dãy số 1, -3, 7, -15, 31, … (n là số nhập vào từ bàn phím).
 */
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào số nguyên n: ");
            int n = scanner.nextInt(); // 10

            int a = 1;
            int d = 1;

            while (a <= n) { // 15 <= 10
                System.out.print(a * d + " "); // 1 -3 7
                a = a * 2 + 1; // a = 15
                d = -d; // -1
            }
    }
}