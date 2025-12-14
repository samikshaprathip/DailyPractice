class Solution {
    public int maxSubArray(int[] nums) {
        int max_num=nums[0];
        int curr_max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_max=Math.max(nums[i],nums[i]+curr_max);
            max_num=Math.max(curr_max,max_num);
        }
        return max_num;
    }
}