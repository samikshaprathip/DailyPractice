class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=nums[0];
        int max=nums[0];
        int currMax=nums[0];
        int min=nums[0];
        int currMin=nums[0];
        for(int i=1;i<nums.length;i++){
            int x = nums[i];
            total+=x;
            currMax=Math.max(x,currMax+x);
            max=Math.max(max,currMax);
            currMin=Math.min(x,currMin+x);
            min=Math.min(min,currMin);
        }
        if(max<0)return max;
        return Math.max(max,total-min);
    }
}