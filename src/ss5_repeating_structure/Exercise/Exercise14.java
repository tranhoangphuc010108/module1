package ss5_repeating_structure.Exercise;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>

 * * * * * *
 *         *
 *         *
 *         *
 *         *
 * * * * * *


 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

 */

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canh = 5;

        for(int i = 1; i <= canh; i++) { // i = 2
            for(int j = 1; j <= canh; j++) { // j = 1; j <= 5l j++ j = 2, 3, 4
                if( i == 1 || j == canh ) { // ||: false khi ca hai deu false
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Xuống dòng
        }

//        System.out.print("Nhập chiều dài cạnh của hình vuông: ");
//        int edgeeLength = scanner.nextInt();
//      for (int i = 1; i <= edgeeLength; i++) {
//            for (int j = 1; j <= edgeeLength; j++) {
//                if (i == 1 || i == edgeeLength || j == 1 || j == edgeeLength  ) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//                System.out.println();
//            }
        }
    }