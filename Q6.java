public class Q6 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        Q6 solution = new Q6();
        int result = solution.singleNumber(nums);
        System.out.println("Result: " + result);
        // Output: Result: 1
    }
}
