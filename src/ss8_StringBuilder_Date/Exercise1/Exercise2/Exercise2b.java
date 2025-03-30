package ss8_StringBuilder_Date.Exercise1.Exercise2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Exercise2b {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Ngày hiện tại: " + formattedDate);
    }
}