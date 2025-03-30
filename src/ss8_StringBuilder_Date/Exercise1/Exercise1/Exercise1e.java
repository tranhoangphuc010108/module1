package ss8_StringBuilder_Date.Exercise1.Exercise1;

/**
 * e. Viết chương trình phân biệt sự khác nhau giữa
 * so sánh bằng method equals và so sánh bằng toán
 * tử == khi sử dụng String, StringBuffer và StringBuilder.
 */
public class Exercise1e {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("hello");
        String str3 = "Hello";

        System.out.println("So sánh String: ");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("\n so sánh StringBuffer:");
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2));
        System.out.println("sb1 == sb2: " + (sb1 == sb2));

        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");

        System.out.println("\n So sánh stringBuilder: ");
        System.out.println("stringBuilder1.equals(stringBuilder2): " + stringBuilder1.equals(stringBuilder2));
        System.out.println("stringBuilder1 == stringBuilder2: " + (stringBuilder1 == stringBuilder2));

    }
}
