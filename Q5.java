import java.util.Arrays;

public class Q5 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            for (int i = 1; i <= n; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
        // Output: Result: [1, 2, 4]
    }
}
