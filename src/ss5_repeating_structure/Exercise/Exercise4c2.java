package ss5_repeating_structure.Exercise;

/**
 * n dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
 */
import java.util.Scanner;

public class Exercise4c2 {
    public static void main(String[] args) {
         // i = 6
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        int distance = 3;
        int count = 0;

        for (int i = 2; i <= n; i += 2) {
            count++; // 1
            if (count == distance) { // 1Scanner scanner = new Scanner(System.in);

                System.out.println(-i + " "); // -6
                count = 0;
            } else {
                System.out.println(i + " "); // 2 4 8
            }
        }
    }
}