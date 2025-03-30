package ss5_repeating_structure.Exercise.Exercise17;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * <p>
 * * * * * *
 * *
 * *
 * *
 * *
 * * * * * *
 * <p>
 * <p>
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canh = 5;

        // a
        System.out.println("Hình a.");
        for (int i = 1; i <= canh; i++) { // i = 2
            for (int j = 1; j <= i; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng
        }

        // b
        System.out.println("Hình b.");
        for (int i = 1; i <= canh; i++) { // i = 2
            for (int j = 1; j <= canh - i + 1; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng
        }

        System.out.println("Hình c.");
        for (int i = 1; i <= canh; i++) { // i = 2
            for (int j = 1; j <= canh - i; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng
        }

        System.out.println("Hình e.");
        for(int i = 1; i <= canh; i++) { // i = 2
            for(int j = 1; j <= canh; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                if( i == 1 || j == 1 || i + j - 1 == canh) { // ||: false khi ca hai deu false
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Xuống dòng
        }

        System.out.println("Hình f.");
        for (int i = 1; i <= canh; i++) { // i = 2
            for (int j = 1; j <= canh - i; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                System.out.print(" ");
            }

            for (int j = 1; j < i * 2; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng
        }
    }
}