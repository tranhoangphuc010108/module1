package ss4_conditon_structure.exercise;

import java.util.Scanner;

/**
 *Kiểm tra 1 số nguyên dương x có phải là
 *  số chính phương hay không? Định nghĩa
 *  số chính phương: Là số mà kết quả khai
 *  căn bậc 2 của nó là 1 số nguyên.
 *  vd: 0, 1, 4, 9, 16, 25, 36 ...
 */

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên dương x: ");
        int x = scanner.nextInt(); // 4

        double squareRoot = Math.sqrt(x); // Căn bậc 2 của x

        System.out.println("squareRoot = " + squareRoot);

        if (squareRoot % 1 ==0) { // 3.1622776601683795%1 = 0.1622776601683795
            System.out.println(x + " Là số chính phương.");
        } else {
            System.out.println(x + " Không phải là số chính phương.");
        }
    }
}
