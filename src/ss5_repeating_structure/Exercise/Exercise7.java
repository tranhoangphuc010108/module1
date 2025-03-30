package ss5_repeating_structure.Exercise;

/**
 * In dãy số 1, 2, 3, 5, 8, 13, …n (n là số nhập vào từ bàn phím) (*).
 *
 * Fibonacci là một chuỗi các số bắt đầu từ 0, 1 với quy luật số phía sau là tổng của 2 số đứng liền trước.
 */
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt(); // n = 10

        int f1 = 0;
        int f2 = 1;
        int fn = 1;


        while (fn <= n) { // fn <= n: Điều kiện để chạy tiếp // 13 <= 10
            System.out.print(fn + " "); // 1 2 3 5 8
            f1 = f2; // f1 = 5
            f2 = fn; // f2 = 8
            fn = f1 + f2; // fn = 13
        }
    }
}
