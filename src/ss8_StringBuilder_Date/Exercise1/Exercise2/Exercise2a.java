package ss8_StringBuilder_Date.Exercise1.Exercise2;

/**
 * a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
 */
import java.text.ParseException; //ParseException: Xử lý ngoại lệ khi chuyển đổi chuỗi sang kiểu Date nếu định dạng không hợp lệ.
import java.text.SimpleDateFormat; //SimpleDateFormat: Định dạng chuỗi ngày tháng.
import java.util.Date; //Date: Đại diện cho một đối tượng ngày tháng trong Java.

public class Exercise2a {
    public static void main(String[] args) throws ParseException {
        String dataStr = "02/28/2023";
        SimpleDateFormat dataFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date =dataFormat.parse(dataStr);
        System.out.println("java.util.Date: " + date);
    }
}
