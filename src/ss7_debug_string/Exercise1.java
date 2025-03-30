package ss7_debug_string;

import java.util.Scanner;

/**
 * Cho chuỗi "Hello World"
 * a. Lấy ra chữ World
 * b. Thay o thành f
 * c. Đếm xem có bao nhiêu chữ l
 * d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
 * e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
 * f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
 * g. Đảo chuỗi thành dlroW olleH
 * h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
 * i. Đổi toàn bộ kí tự của S sang chữ Hoa
 * k. Đổi toàn bộ kí tự của S sang chữ thường
 * l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Hello World";

// a. Lấy ra chữ World
        System.out.println(" a. Lấy ra chữ World: " + str.substring(6));

        //b. Thay o thành f
        System.out.println("b. Thay o thành f: " + str.replace('o', 'f'));

        // c. Đếm xem có bao nhiêu chữ l
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("c. số kí tự l: " + count);
        //  d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        System.out.println("vị trí xuất hiện đầu tiên: " + str.indexOf('l')); // "Hello World"
        System.out.println(" vị trí xuất hiện cuối cùng: " + str.lastIndexOf('l'));

        //  e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
        System.out.println(" e. Xóa hết space giữa chừng, đầu tiên và cuối cùng: " +
                str.replace(" ", ""));

        //f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        System.out.println("f. Xóa hết space đầu tiên và cuối cùng: " + str.trim());
//     g. Đảo chuỗi thành dlroW olleH
        String chainReversal = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            chainReversal += str.charAt(i);
        }

        System.out.println("g. đảo chuỗi: " + chainReversal);

        //h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
        System.out.println("h. Hãy tạo thành chuỗi \"SQC Hello World\"");
        //c1
        System.out.println("SQC " + str);
        //c2
        System.out.println("SQC ".concat(str));

        // i. Đổi toàn bộ kí tự của S thành chữ hoa
        System.out.println("i.Đổi toàn bộ kí tự của S thành chữ hoa: " + str.toUpperCase());

        // k. Đổi toàn bộ kí tự của S thành chữ thường
        System.out.println("k. Đổi toàn bộ kí tự của S thành chữ thường: " + str.toLowerCase());

        // l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        System.out.println(" l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S");

        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();

        System.out.println("Nhập vào m: ");
        int m = scanner.nextInt();

        System.out.printf("Chuỗi con từ kí tự thứ %d đến thứ  %d: %s", n, m, str.substring(n, m));
    }
}
