package ss8_StringBuilder_Date.Exercise1.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy.
 * Hãy chuyển thành 2 biến kiểu LocalDate. Sau đó hãy
 * tính số ngày chênh lệch giữa 2 ngày đã nhập vào.
 */

public class Exercise2h {
    public static void main(String[] args) {
        String dateStr1 = "25/02/2025";
        String dateStr2 = "26/05/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(dateStr1, formatter);
        LocalDate localDate2 = LocalDate.parse(dateStr2, formatter);
long daysDifference = localDate1.until(localDate2, ChronoUnit.DAYS);
        System.out.println("Số ngày chênh lệch: " + daysDifference);

    }
}
