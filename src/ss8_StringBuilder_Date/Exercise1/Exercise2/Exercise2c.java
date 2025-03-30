package ss8_StringBuilder_Date.Exercise1.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
 */
public class Exercise2c {
    public static void main(String[] args) {
        String dateStr = "02/28/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                LocalDate localDate = LocalDate.parse(dateStr, formatter);
        System.out.println("LocalData: " + localDate);
    }
}
