package ss8_StringBuilder_Date.Exercise1.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate
 * sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn
 */
public class Exercise2d {
    public static void main(String[] args) {
        LocalDate currentData = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String formattedData = currentData.format(formatter);
        System.out.println("Ngày hiện tại: " + formattedData);
    }
}
