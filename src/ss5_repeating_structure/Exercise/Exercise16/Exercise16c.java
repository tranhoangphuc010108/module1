package ss5_repeating_structure.Exercise.Exercise16;

import java.util.Scanner;

/**
 * Hình c
 *         *
 *       **
 *     ***
 *   ****
 * *****
 *
 */
public class Exercise16c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp vào chiều dài cạnh hình tam giác: ");
        int edgeeLength = scanner.nextInt();

        for (int i = 1; i <= edgeeLength; i++) {
            for (int j = 1; j <= edgeeLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}