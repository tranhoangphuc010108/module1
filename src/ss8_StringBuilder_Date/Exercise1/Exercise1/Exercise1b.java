package ss8_StringBuilder_Date.Exercise1.Exercise1;

/**
 * b. Cho chuỗi "Hello World"
 * Thay o thành f bằng cách dùng StringBuffer và StringBuilder.
 */
public class Exercise1b {
    public static void main(String[] args) {
        String input = "Hello World";

        StringBuffer  StringBuffer = new StringBuffer(input);
        StringBuffer.replace(4, 5, "f");
        StringBuffer.replace(7, 8, "f");

        StringBuilder  StringBuilder = new StringBuilder(input);
        StringBuilder.replace(4, 5, "f");
        StringBuilder.replace(7, 8, "f");
        System.out.println("dùng StringBuffer: " + StringBuffer);
        System.out.println("dùng StringBuilder: " + StringBuilder);
    }
}
