package ss5_repeating_structure.Exercise;

/**
 * In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        // n = 3
        for (int i = 1; i <= n; i++) {
            // i = 1; 1 <= 3 => true; i => 1
            // i = 2; 2 <= 3 => true; i => 2
            // i = 3; 3 <= 3 => true; i => 3
            // i = 4; 4 <= 3 => false
            System.out.print(i + " ");
        }
    }
}