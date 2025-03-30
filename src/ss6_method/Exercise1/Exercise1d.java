package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * d. Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên
 */
public class Exercise1d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số nguyên c: ");
        int c = scanner.nextInt();

        System.out.println("Nhập vào số nguyên d: ");
        int d = scanner.nextInt();

        int min =min(a, b, c, d);

        System.out.println("Giá trị nhỏ nhất của 4 số nguyên: " + min);
    }
    static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}
