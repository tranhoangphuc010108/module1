package ss5_repeating_structure.Exercise;

/**
 * Tìm và in lên màn hình tất cả các số nguyên
 * trong phạm vitừ 10 đến 99 sao cho tích của 2
 * chữ số bằng 2 lần tổng của 2 chữ số đó. Ví dụ: Số 44
 */
public class Exercise23 {
    public static void main(String[] args) {

        for (int number = 10; number < 100; number++) {
            int tenDigit = number / 10;
            int oneDigit = number % 10;

            int sum = tenDigit + oneDigit;
            int product = tenDigit * oneDigit;

            if (product == sum * 2) {
                System.out.println(number);
            }
        }
    }
}