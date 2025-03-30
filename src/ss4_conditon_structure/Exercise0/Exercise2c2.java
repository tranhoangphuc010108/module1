package ss4_conditon_structure.Exercise0;

import java.util.Scanner;

/**
 * Cách 2: Dùng switch case. / /Bổ sung cách 2
 */
public class Exercise2c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số từ 1-10 :");
        int number = scanner.nextInt();
        String englishNumber;
      switch (number) {
          case 1:
              englishNumber = "One";
              break;
          case 2:
              englishNumber = "Two";
              break;
          case 3:
              englishNumber = "Three";
              break;
          case 4:
              englishNumber = "Four";
              break;
          case 5:
              englishNumber = "Five";
              break;
          case 6:
              englishNumber = "Six";
              break;
          case 7:
              englishNumber = "Seven";
              break;
          case 8:
              englishNumber = "Eight";
              break;
          case 9:
              englishNumber = "Nine";
              break;
          case 10:
              englishNumber = "Ten";
              break;
          default:
              System.out.println("Số không hợp lệ:");
              break;
      }
        System.out.print("Số " + number + "Chữ tiếng anh: " );


    }
}
