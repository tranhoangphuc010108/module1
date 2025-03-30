package ss5_repeating_structure.Exercise;
/**
 * Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
 *
 * (Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên m: ");
        int m = scanner.nextInt(); // 234

        int s = 0;
        int p = 1;

        while (m > 0) { // Vòng lặp vô hạn
           int digit = m % 10; // 2 % 10 = 2
           s += digit;
           p *= digit;

           m /= 10;
            System.out.println(m);
        }

        System.out.println("Tổng các chữ số s = " + s);
        System.out.println("Tích các chữ số p = " + p);
    }
}
