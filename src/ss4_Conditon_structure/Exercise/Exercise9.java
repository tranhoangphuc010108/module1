package ss4_Conditon_structure.Exercise;

import java.util.Scanner;

/**
 * Nhập vào 1 ký tự là chữ cái. Nếu nhập sai thì báo thông báo
 * đã nhập sai. Nếu đúng thì đi kiểm tra nếu đó đang là chữ cái
 * thường thì biến nó thành chữ cái hoa, nếu nó là chữ cái hoa
 * thì biến nó thành chữ cái thường. Gợi ý: Ký tự chữ cái thường
 * và hoa có mã ASCII cách nhau 32 đơn vị. Vd: ‘a’ là 97, ‘A’ là 65
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự chữ cái: ");
        char character = scanner.next().charAt(0);

        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {

            if (character >= 'a' && character <= 'z') {
                character -= 32;
            } else {
                character += 32;
            }
            System.out.println("Ký tự sau khi đã đổi: " + character);
        } else {
            System.out.println("Bạn dã nhập sai. Hãy nhập một ký tự chữ cái");
            }
        }
    }