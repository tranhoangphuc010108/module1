package ss5_repeating_structure.Exercise15;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * Hình b
 * * * * * * *
 *               *
 *               *
 *               *
 *               *
 * * * * * * *
 */
public class Exercise15b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh của hình vuông: ");
        int edgeeLength = scanner.nextInt();

        for(int i = 1; i <= edgeeLength; i++) {
            for (int j = 1; j <= edgeeLength; j++) {
                if (i == edgeeLength || i == 1 || j == edgeeLength) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}