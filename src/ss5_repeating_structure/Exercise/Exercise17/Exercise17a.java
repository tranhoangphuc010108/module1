package ss5_repeating_structure.Exercise.Exercise17;

import java.util.Scanner;

/**
 * ******
 *  *
 *    *
 *      *
 *        *
 * ******
 */
public class Exercise17a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh: ");
        int edgeeLength = scanner.nextInt();

        for (int i = 1; i <= edgeeLength; i++) {
            for (int j = 1; j <= edgeeLength; j++) {
                if (i == 1 || i == edgeeLength || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
