package ss4_conditon_structure.exercise;

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

//        String name = scanner.nextLine(); // chartAt(0)
//        System.out.println(name.charAt(0));

        System.out.print("Nhập một ký tự chữ cái: ");
        char character = scanner.nextLine().charAt(0);

        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) { // Hoa hoặc thường
             if (character >= 'a' && character <= 'z') { // Thường 97-32=65 => 'A'
                character -= 32; // -32 cho xuống ký tự hoa
            } else {
                character += 32; // + 32 cho lên ký tự thường
            }
            System.out.println("Ký tự sau khi đã đổi: " + character);
        } else { // Không phải ký tự hoa hoặc thường => Sai yêu cầu đề bài
            System.out.println("Bạn dã nhập sai. Hãy nhập một ký tự chữ cái");
        }
    }
}