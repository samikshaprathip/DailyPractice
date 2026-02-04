class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);                
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, used, result);
        return result;
    }
    private void backtrack(List<Integer> temp,
                           int[] nums,
                           boolean[] used,
                           List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(temp, nums, used, result);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
