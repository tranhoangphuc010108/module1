package ss5_repeating_structure.Exercise;

/**
 * In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (n là số nhập vào từ bàn phím)
 * Quy luật???
 */
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        int distance = 1; // Xuất hiện ra 65dấu -
        int count = 0;

        for (int i = 2; i <= n; i += 2) { // i = 4
            if (count == distance) { // 1 == 1
                System.out.println(-i + " "); // -4
                count = 0;
                distance++; // 2
            } else {
                System.out.println(i + " "); // 2
                count++; // 1
            }
        }
    }
}