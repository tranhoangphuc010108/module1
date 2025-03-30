package ss5_repeating_structure.Exercise;

import java.util.Scanner;

/**
 * Hệ thống tiền Việt Nam có các mệnh giá sau:
 * 1000đ
 * 2000đ
 * 5000đ
 * 10000đ
 * 20000đ
 * 50000đ
 * 100000đ
 * 200000đ
 * 500000đ
 * Người mua hàng phải trả tiền cho sản phẩm mà họ đã mua.
 * Hãy nhập vào giá tiền của món đồ và tiền khách hàng  trả,
 * viết chươngtrình hỗ trợ nhân viên cửa hàng thối tiền lại
 * cho khách hàng sao cho số tờ tiền phải thối lại là ít nhất.
 */
public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá tiền của món đồ: ");
        int giaMonDo = scanner.nextInt();

        System.out.println("Nhập số tiền khách hàng trả: ");
        int tienKhachHang = scanner.nextInt();

        int tienThoiLai = tienKhachHang - giaMonDo;
        int menhGiaTien;

        for (int i = 2; i >= 0; i--) {
            int heSo = (int) Math.pow(10, i);

            menhGiaTien = 5000 * heSo;
            if (tienThoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien,menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 2000 * heSo;
            if (tienThoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien,menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 1000 * heSo;
            if (tienThoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien,menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
        }
        System.out.println("Số tiền còn lại: " + tienThoiLai);
    }
}
