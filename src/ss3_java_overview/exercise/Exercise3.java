package ss3_java_overview.exercise;

import java.util.Scanner;

/**
 * Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
 * a. tiền = số lượng * đơn giá
 * b. thuế giá trị gia tăng = 10%
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        int amount = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        double unitPrice = scanner.nextDouble();

        double money = amount * unitPrice;
        double dutyGTGT = 0.1 * money;

        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Tiền: " + money);
        System.out.println("Thuế GTGT: " + dutyGTGT);
    }
}
