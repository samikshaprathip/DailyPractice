class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(sum.containsKey(target-num)){
                return new int[] {sum.get(target-num),i};
            }
            sum.put(num,i);
        }
        return new int[]{};
    }
}