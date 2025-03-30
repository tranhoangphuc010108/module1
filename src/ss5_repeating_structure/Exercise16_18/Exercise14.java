package ss5_repeating_structure.Exercise16_18;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 *
 * * * * * *
 *         *
 *         *
 *         *
 *         *
 * * * * * *
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh: ");
        int canh = scanner.nextInt();

        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == 1 || j == canh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
