class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            if(x<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(x,x*max);
            min=Math.min(x,x*min);
            res=Math.max(res,max);
        }
        return res;
    }
}