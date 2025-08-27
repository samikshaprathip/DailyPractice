public class GoodPairs {

    // Function to count good pairs
    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[101]; // frequency array (1 to 100)
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += count[nums[i]]; // add how many times seen before
            count[nums[i]]++;         // update frequency
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3, 1, 1, 3};

        int answer = numIdenticalPairs(nums);

        System.out.println("Number of good pairs = " + answer);
    }
}

