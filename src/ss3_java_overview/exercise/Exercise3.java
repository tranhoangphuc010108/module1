package ss3_java_overview.exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String TenSanPham = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        int SoLuong = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        double DonGia = scanner.nextDouble();

        double Tien = SoLuong * DonGia;
        double ThueGTGT = 0.1 * Tien;

        System.out.println("Tên sản phẩm: " + TenSanPham);
        System.out.println("Tiền: " + Tien);
        System.out.println("Thuế GTGT: " + ThueGTGT);







    }
}
