class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> samyash = new HashMap<>();
        int res = 0;
        for(int num : nums){
            if(!samyash.containsKey(num)){
                samyash.put(num,samyash.getOrDefault(num-1,0)+samyash.getOrDefault(num+1,0)+1);
                samyash.put(num-samyash.getOrDefault(num-1,0),samyash.get(num));
                samyash.put(num+samyash.getOrDefault(num+1,0),samyash.get(num));
                res = Math.max(res,samyash.get(num));
            }
        }
        return res;
    }
}