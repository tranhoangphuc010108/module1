package ss5_repeating_structure.Exercise;

/**
 * n dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
 */
import java.util.Scanner;

public class Exercise4c1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {

            if (i % 6 == 0) {
                System.out.println(-i + " ");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}