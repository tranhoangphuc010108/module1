package ss5_repeating_structure.Exercise.Exercise16;

import java.util.Scanner;

/**
 * Hình e
 * * * * * *
 * *     *
 * *   *
 * * *
 * *
 */
public class Exercise16e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhâp vào chiều dài cạnh hình tam giác: ");
        int edgeeLength = scanner.nextInt();

        for (int i = 1; i <= edgeeLength; i++) {
            for (int j = 1; j <= edgeeLength - i + 1; j++) {
                if (i == 1|| j == 1 || j == edgeeLength - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();

            }
        }
    }