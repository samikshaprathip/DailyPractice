class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) return true;
            if ((nums[mid] == nums[s]) && (nums[mid] == nums[e])) {
                s++;
                e--;
            } 
            else if (nums[mid] <= nums[e]) {
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } 
            else { 
                if (target >= nums[s] && nums[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return false;
    }  
}