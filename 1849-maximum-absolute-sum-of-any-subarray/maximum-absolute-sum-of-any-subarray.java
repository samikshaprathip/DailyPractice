class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0,currMax=0;
        int min=0,currMin=0;
        for(int i=0;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            max=Math.max(max,currMax);
            currMin=Math.min(nums[i],currMin+nums[i]);
            min=Math.min(min,currMin);
        }
        return Math.max(max, Math.abs(min));
    }
}