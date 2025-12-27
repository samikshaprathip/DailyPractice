class Solution {
    public static int first = -1;
    public static int last = -1;

    public int[] searchRange(int[] nums, int target) {
        first = -1;
        last = -1;
        helper(nums, 0, target);

        
        if (first != -1 && last == -1) {
            last = first;
        }

        return new int[]{first, last};
    }

    private void helper(int[] nums, int idx, int target) {
        if (idx == nums.length) {
            return;
        }

        if (nums[idx] == target) {
            if (first == -1) {
                first = idx;
            }
            last = idx; 
        }

        helper(nums, idx + 1, target);
    }
}
