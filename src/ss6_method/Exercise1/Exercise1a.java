package ss6_method.Exercise1; // Đảm bảo tên package đúng với cấu trúc thư mục của bạn

import java.util.Scanner; // Thêm import Scanner

public class Exercise1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự hoa: ");
        char uppercaseChar = scanner.next().charAt(0);

        scanner.close(); // Đóng scanner sau khi sử dụng

        // Gọi phương thức chuyển đổi và in kết quả
        char lowercaseChar = toLowerCase(uppercaseChar);
        System.out.println("Ký tự thường tương ứng: " + lowercaseChar);
    }

    // Phương thức chuyển đổi ký tự hoa sang ký tự thường
    static char toLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }
}
