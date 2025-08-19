public class Zero {

    // Function to count zero-filled subarrays
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = nums.length, curr = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                curr++;
            } else {
                ans += (1L * curr * (curr + 1) / 2);
                curr = 0;
            }
        }

        // Add remaining zero sequence if array ends with zeros
        ans += (1L * curr * (curr + 1) / 2);

        return ans;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Zero sol = new Zero();

        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 3, 0, 0, 2, 0, 0, 4};

        System.out.println("Zero-filled subarrays in nums1: " + sol.zeroFilledSubarray(nums1));
        System.out.println("Zero-filled subarrays in nums2: " + sol.zeroFilledSubarray(nums2));
    }
}
