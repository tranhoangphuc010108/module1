package ss8_StringBuilder_Date.Exercise1.Exercise1;

/**
 * a. Cho chuỗi "Hello World"
 *     Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.
 */
public class Exercise1a {
    public static void main(String[] args) {
        String input = "Hello World";

        StringBuffer stringBuffer = new StringBuffer(input);

        String result1 = stringBuffer.substring(6);

        StringBuilder stringBuilder = new StringBuilder(input);

        String result2 = stringBuilder.substring(6);

        System.out.println("dùng StringBuffer: " + result1);
        System.out.println("dùng StringBuilder: " + result2);


    }
}
