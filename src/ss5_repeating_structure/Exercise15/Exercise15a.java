package ss5_repeating_structure.Exercise15;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * * * * * * *
 * *
 * *
 * *
 * *
 * * * * * * *
 */
public class Exercise15a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài cạnh của hình vuông: ");
        int edgeeLength = scanner.nextInt();

        for (int i = 1; i <= edgeeLength; i++) {
            for (int j = 1; j <= edgeeLength; j++) {

                if (i == 1 || i == edgeeLength || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
