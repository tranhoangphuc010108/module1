package ss4_Conditon_structure.Exercise;

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

        System.out.println("Nập một số nguyên dương x: ");
        int x = scanner.nextInt();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 ==0) {
            System.out.println(x + " Là số chính phương.");
        } else {
            System.out.println(x + " Không phải là số chính phương.");
        }
    }
}
