package ss5_repeating_structure.Exercise;

import java.util.Scanner;

/**
 * Viết chương trình tính S = a! + b! + c! với
 * a, b, c là 3 số nguyên dương nhập từ bàn phím.
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        int factorialA = 1, factorialB = 1, factorialC = 1;

        do {
            System.out.println("Nhập số nguyên dương A: ");
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Nhập lại số nguyên dương: ");
            }
        } while (a <= 0);

        do {
            System.out.println("Nhập số nguyên dương b: ");
            b = scanner.nextInt();

            if (b <= 0) {
                System.out.println("Nhập lại số nguyên dương: ");
            }
        } while (b <= 0);

        do {
            System.out.println("Nhập số nguyên dương A: ");
            c = scanner.nextInt();

            if (c <= 0) {
                System.out.println("Nhập lại số nguyên dương: ");
            }
        } while (c <= 0);

        for (int i = 1; i <= a; i++) {
            factorialA *= i;
        }

        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }

        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }

        int s = factorialA + factorialB + factorialC;

        System.out.printf("Tổng của %d! + %d! + %d! = %d", a, b, c, s);
    }
}
