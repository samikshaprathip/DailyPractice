class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int as = ((n)*(n+1)) / 2;
        int missing = as-sum;
        return missing;
    }
}