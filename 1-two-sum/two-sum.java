class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(mp.containsKey(target-num)){
                return new int[]{mp.get(target-num),i};
            }
            mp.put(num,i);
        }
        return new int[]{};
    }
}