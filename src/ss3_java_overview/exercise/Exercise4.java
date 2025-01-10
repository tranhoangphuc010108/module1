package ss3_java_overview.exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm toán: ");
        double diemToan = scanner.nextDouble();

        System.out.print("Nhập vào hệ số toán: ");
        double hsToan = scanner.nextDouble();

        System.out.print("Nhập vào điểm lý: ");
        double diemLy = scanner.nextDouble();

        System.out.print("Nhập vào hệ số lý: ");
        double hsLy = scanner.nextDouble();

        System.out.print("Nhập vào điểm hóa: ");
        double diemHoa = scanner.nextDouble();

        System.out.print("Nhập vào hệ số hóa: ");
        double hsHoa = scanner.nextDouble();

        double diemTB = (diemToan * hsToan + diemLy * hsLy + diemHoa * hsHoa) / (hsToan + hsLy + hsHoa);
        System.out.println("DiemTB: " + diemTB);

    }
}
