class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, result);
        return result;
    }

    private void backtrack(List<Integer> tempList, int[] nums, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) continue;

            tempList.add(nums[i]);
            backtrack(tempList, nums, result);
            tempList.remove(tempList.size() - 1);
        }
    }
}
