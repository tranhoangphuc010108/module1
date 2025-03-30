package ss8_StringBuilder_Date.Exercise1.Exercise2;

import java.time.LocalDate;

/**
 * g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
 */
public class Exercise2g {
    public static void main(String[] args) {
        LocalDate currentData = LocalDate.now();
        LocalDate futureData = currentData.plusDays(1000);
        System.out.println("1000 ngày sau là: " + futureData);
    }
}
