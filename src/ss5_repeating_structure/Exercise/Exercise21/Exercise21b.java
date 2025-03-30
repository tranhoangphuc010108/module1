package ss5_repeating_structure.Exercise.Exercise21;

import java.util.Scanner;

/**
 * Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 * b. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13, …
 */
public class Exercise21b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d là số nguyên tố", n);
        } else {
            System.out.printf("%d không là số nguyên tố", n);
        }
    }
}