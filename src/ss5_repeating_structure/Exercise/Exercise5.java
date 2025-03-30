package ss5_repeating_structure.Exercise;

/**
 * In dãy số 2, 4, 6, 8, 10 … 2n (n là số nhập vào từ bàn phím) (*)
 */
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n * 2; i += 2) {
            System.out.println(i + " ");
        }
    }
}
