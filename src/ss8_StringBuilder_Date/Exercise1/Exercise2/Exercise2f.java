package ss8_StringBuilder_Date.Exercise1.Exercise2;

/**
 * f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại)
 * sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise2f {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate oneMonthLater = currentDate.plusMonths(1);
        System.out.println("1 tháng sau rơi vào thứ: " + oneMonthLater.getDayOfWeek());
        long daysUntilOneMonthLater = currentDate.until(currentDate, ChronoUnit.DAYS);

        System.out.println("1 tháng sau: " + oneMonthLater);
        System.out.println("Số ngày đến 1 tháng sau là: " + daysUntilOneMonthLater);

    }
}
