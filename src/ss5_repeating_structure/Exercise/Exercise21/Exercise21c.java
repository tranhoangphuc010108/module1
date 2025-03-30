package ss5_repeating_structure.Exercise.Exercise21;

import java.util.Scanner;

/**
 * Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 * c. Các chữ số có tăng dần không? Ví dụ: 2345, 367, 59, 123, …
 */
public class Exercise21c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        String str = Integer.toString(n); // "12345"

        boolean isIncreasing = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) { // 1 >= 2
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.printf("%d chứa các chữ số tăng dần", n);
        } else {
            System.out.printf("%d không  chứa các chữ số tăng dần", n);
        }
    }
}