package ss8_StringBuilder_Date.Exercise1.Exercise1;

/**
 * c. Cho chuỗi "Hello" và chuỗi “World”
 *     Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
 */
public class Exercise1c {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result1 = str1 + str2;

        StringBuffer StringBuffer = new StringBuffer(str1);
        StringBuffer.append(str2);
        String result2 = StringBuffer.toString();

        StringBuilder StringBuilder = new StringBuilder(str1);
        StringBuilder.append(str2);
        String result3 = StringBuilder.toString();

        System.out.println("dùng String: " + result1);
        System.out.println("dùng StringBuffer: " + result2);
        System.out.println("dùng StringBuilder: " + result3);



    }
}
