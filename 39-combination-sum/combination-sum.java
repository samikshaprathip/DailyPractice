class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> curr,int[] nums,int target,int index){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || index==nums.length)return;
        curr.add(nums[index]);
        backtrack(result,curr,nums,target-nums[index],index);
        curr.remove(curr.size()-1);
        backtrack(result,curr,nums,target,index+1);
    }
}