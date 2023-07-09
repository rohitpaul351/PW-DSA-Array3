import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();

        // Handle the case where the first element is missing
        if (lower < nums[0]) {
            ranges.add(getRange(lower, nums[0] - 1));
        }

        // Check for missing elements between consecutive elements in nums
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                ranges.add(getRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }

        // Handle the case where the last element is missing
        if (upper > nums[nums.length - 1]) {
            ranges.add(getRange(nums[nums.length - 1] + 1, upper));
        }

        return ranges;
    }

    private String getRange(int start, int end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        Q7 solution = new Q7();
        List<String> result = solution.findMissingRanges(nums, lower, upper);
        System.out.println("Result: " + result);
        // Output: Result: [2, 4->49, 51->74, 76->99]
    }
}
