package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * Phương thức trả về USCLN của 2 số nguyên.
 */
public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();


        System.out.printf("Ước số chung lớn nhất của 2 số %d và %d là: %d", a, b, uscln(a, b));
    }
    static int uscln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }
        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
