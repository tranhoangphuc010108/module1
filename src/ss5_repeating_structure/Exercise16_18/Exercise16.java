package ss5_repeating_structure.Exercise16_18;

import java.util.Scanner;

/**
 * Hình a
 * *
 * **
 * ***
 * ****
 * *****
 *
 * Hình b
 * *****
 * ****
 * ***
 * **
 * *
 *
 * Hình c
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * Hình d
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *
 * Hình e
 * *****
 * *  *
 * * *
 * **
 * *
 *
 * Hình f
 *    *
 *   ***
 *  *****
 * *******
 *
 * Hình g
 * *******
 *  *****
 *   ***
 *    *
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh: ");
        int canh = scanner.nextInt();

        System.out.println("Hình a: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hình b:");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hình c: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hình d: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= canh - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hình e: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i + 1; j++) {
                if (i == 1 || j == 1 || j == canh - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Hình f: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hình g:");
        ;
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (canh - i) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}