class SumUnique {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101]; // if nums[i] are in range 1..100

        // Count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int sum = 0;

        // Sum only numbers that appear once
        for (int i = 0; i < nums.length; i++) {
            if (freq[nums[i]] == 1) {
                sum += nums[i];
            }
        }

        return sum;
    }

    // Test the code
    public static void main(String[] args) {
        SumUnique sol = new SumUnique();
        int[] nums = {1, 2, 3, 2};
        System.out.println(sol.sumOfUnique(nums)); // Output: 4 (1 + 3)
    }
}
