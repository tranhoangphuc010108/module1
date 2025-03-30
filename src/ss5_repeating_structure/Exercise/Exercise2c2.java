package ss5_repeating_structure.Exercise;

/**
 * In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
 */
import java.util.Scanner;

public class Exercise2c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i + " ");
        }
    }
}