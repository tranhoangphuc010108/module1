package ss5_repeating_structure.Exercise;

/**
 * In dãy số 1, 3, 7, 15, 31, …n (n là số nhập vào từ bàn phím)
 */
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        int a = 1;

        while (a <= n) {
            System.out.print(a + " ");
            a = 2 * a + 1;
        }
    }
}
