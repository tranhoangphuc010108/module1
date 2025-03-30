package ss5_repeating_structure.Exercise16_18;

import java.util.Scanner;

/**
 * Hình a
 * ******
 *  *
 *    *
 *      *
 *        *
 * ******
 *
 * Hình b
 * ******
 *        *
 *      *
 *    *
 *  *
 * ******
 * 19
 * ******
 * **      *
 * *  *    *
 * *    *  *
 * *      **
 * ******
 */
public class Exercise1718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh: ");
        int canh = scanner.nextInt();

        System.out.println("Hình a: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Hình b: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == canh - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Hình a: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == 1 || j == canh || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
