class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> pair = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(pair.containsKey(target-num)){
                return new int[] {pair.get(target-num),i};
            }
            pair.put(num,i);
        }
        return new int[]{};
    }
}