class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowS=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            windowS +=nums[i];
        }
        long maxS=windowS;
        for(int i=k;i<n;i++){
            windowS+=nums[i]-nums[i-k];
            if(windowS > maxS)maxS=windowS;
        }
        return (double) maxS/k;
    }
}