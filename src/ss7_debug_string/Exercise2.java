package ss7_debug_string;

/**
 * Thực hiện các việc chuyển đổi sau:
 * a. Chuyển đổi String thành int
 * b. Chuyển đổi int thành String
 * c. Chuyển đổi String thành long
 * d. Chuyển đổi long thành String
 * e. Chuyển đổi String thành float
 * f. Chuyển đổi float thành String
 * g. Chuyển đổi String thành double
 * h. Chuyển đổi double thành String
 * i. Chuyển đổi String thành short
 * k. Chuyển đổi short thành String
 */
public class Exercise2 {
    public static void main(String[] args) {

        //    a. Chuyển đổi String thành int
        String aStr = "354665465";
        int a = Integer.parseInt(aStr);
        System.out.println("String thành int: " + a);

        //    b. Chuyển đổi int thành String
        String bStr = String.valueOf(a);
        System.out.println("int thành String: " + bStr);

        //    c. Chuyển đổi String thành long
        String cStr = "546575525254675754";
        long c = Long.parseLong(cStr);
        System.out.println("int thành String: " + c);

        //    d. Chuyển đổi long thành String
        String d = String.valueOf(c);
        System.out.println("long thành String: " + d);

        //    e. Chuyển đổi String thành float
        String eStr = "45.0";
        float e = Float.parseFloat(eStr);
        System.out.println("String thành float: " + e);

        //    f. Chuyển đổi float thành String
String f = String.valueOf(e);
        System.out.println(" float thành String: " + f);

        //    g. Chuyển đổi String thành double
        String gStr = "412.0";
        double g = Double.parseDouble(gStr);
        System.out.println("String thành double: " + g);

        //    h. Chuyển đổi double thành String
        String h = String.valueOf(g);
        System.out.println("double thành String: " + h);

        //    i. Chuyển đổi String thành short
        String iStr = "100";
        short i = Short.parseShort(iStr);
        System.out.println(" String thành short: " + i);

        //    k. Chuyển đổi short thành String
        String k = String.valueOf(i);
        System.out.println("short thành String: " + k);
    }
}
