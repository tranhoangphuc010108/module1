package ss8_StringBuilder_Date.Exercise1.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy.
 * Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.
 */
public class Exercise2i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataStr = "25/02/2008";

        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate =LocalDate.parse(dataStr,formatter);
        LocalDate futureData = localDate.plusDays(n);
        System.out.println("Sau " + n + " ngày: " + futureData.format(formatter));
    }
}
