package ss9_Array;

import java.util.Scanner;

/**
 * Sử dụng các mảng 1 chiều để xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 * <p>
 * Gợi ý: Mỗi thông tin (ví dụ họ tên) sẽ được lưu ở 1 mảng riêng. Thông tin của 1 nhân viên được xác định bằng vị trí của nhân viên đó trong các mảng.
 * <p>
 * Vd: hoTen[1], gioiTinh[1]… sẽ chứa thông tin của nhân viên thứ 2 (vì mảng bắt đầu bằng chỉ số 0).
 * <p>
 * Tương tự, hoTen[n], gioiTinh[k]… sẽ chứa thông tin của nhân viên thứ k+1. (*)
 */
public class Exercise2 {


    static String[] name = new String[5];
    static int[] age = new int[5];
    static String[] sex = new String[5];
    static double[] salary = new double[5];
    static double[] averageScore = new double[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chose;

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            name[i] = scanner.nextLine();

            System.out.print("Tuổi: ");
            age[i] = Integer.parseInt(scanner.nextLine());

            System.out.print("Giới tính: ");
            sex[i] = scanner.nextLine();

            System.out.print("Lương: ");
            salary[i] = Double.parseDouble(scanner.nextLine());

            System.out.print("Điểm trung bình: ");
            averageScore[i] = Double.parseDouble(scanner.nextLine());
        }

        // Hiển thị thông tin nhân viên
        System.out.println("\nThông tin các nhân viên:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            System.out.println("Họ và tên: " + name[i]);
            System.out.println("Tuổi: " + age[i]);
            System.out.println("Giới tính: " + sex[i]);
            System.out.println("Lương: " + salary[i]);
            System.out.println("Điểm trung bình: " + averageScore[i]);
            System.out.println("-------------------------");
        }
    }
}




