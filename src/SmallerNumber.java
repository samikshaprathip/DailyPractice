import java.util.Arrays;

public class SmallerNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            arr[idx++] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        SmallerNumber sol = new SmallerNumber();

        // Example input
        int[] nums = {8, 1, 2, 2, 3};

        int[] result = sol.smallerNumbersThanCurrent(nums);

        // Print result
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
