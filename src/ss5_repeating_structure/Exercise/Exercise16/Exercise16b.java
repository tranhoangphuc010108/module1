package ss5_repeating_structure.Exercise.Exercise16;

import java.util.Scanner;

/**
 * Hình b
 * *****
 * ****
 * ***
 * **
 * *
 */
public class Exercise16b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhâp vào chiều dài cạnh hình tam giác: ");
        int edgeeLength = scanner.nextInt();

        for (int i = 1; i <= edgeeLength; i++) {
            for (int j = 1; j <= edgeeLength - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
